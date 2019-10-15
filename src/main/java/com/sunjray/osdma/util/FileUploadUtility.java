package com.sunjray.osdma.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.sunjray.osdma.constants.AWSConstants;

@Service
@ConfigurationProperties("osdma.dynamicimages")
public class FileUploadUtility {
	@Autowired
	private AmazonS3 s3client;

	private String filepath;

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String uploadFileToS3(String fileName, String productImage, String path) {
		String imagePath = "";
		String bucketName = AWSConstants.AWS_BUCKET_NAME;
		s3client.putObject(
				new PutObjectRequest(bucketName, fileName, CommonUtil.convertBS64ImgToFile(productImage, path))
						.withCannedAcl(CannedAccessControlList.PublicRead));
		imagePath = AWSConstants.AWS_DEFAULT_URL + bucketName + "/" + fileName;
		return imagePath;
	}

	public String saveImage(String fileName, String image, String path) {
		String imagePath = "";
		File file = CommonUtil.convertBS64ImgToFile(image, path);
		if (file.exists()) {
			try {
				byte[] bytes = Files.readAllBytes(file.toPath());
				File dir = new File(filepath);
				System.out.println(dir.exists());
				if (!dir.exists()) {
					dir.mkdirs();
				}
				File serverFile = new File(dir.getAbsolutePath() + File.separator + fileName);
				if (serverFile.exists()) {
					serverFile.delete();
				}
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				imagePath="project-images/"+fileName;
				System.out.println("You successfully uploaded file :" +fileName);
				return imagePath;
			} catch (Exception e) {
				System.out.println("You failed to upload " + fileName + " => " + e.getMessage());
				return imagePath;
			}
		} else {
			System.out.println("You failed to upload " + fileName
					+ " because the file was empty.");
			return imagePath;
		}
	}

}
