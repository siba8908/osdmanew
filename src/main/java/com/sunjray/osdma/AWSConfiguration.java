package com.sunjray.osdma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.sunjray.osdma.constants.AWSConstants;

@Configuration
public class AWSConfiguration {

	@Autowired
	AmazonS3 s3client;

	@Bean
	public AmazonS3 s3client() {

		BasicAWSCredentials awsCreds = new BasicAWSCredentials(AWSConstants.AWS_KEY_ID, AWSConstants.AWS_ACCESS_KEY);
		AmazonS3 s3Client = AmazonS3ClientBuilder.standard().withRegion(Regions.fromName(AWSConstants.AWS_REGION))
				.withCredentials(new AWSStaticCredentialsProvider(awsCreds)).build();

		return s3Client;
	}

}
