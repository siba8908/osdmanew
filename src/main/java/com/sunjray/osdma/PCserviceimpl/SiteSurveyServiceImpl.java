package com.sunjray.osdma.PCserviceimpl;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunjray.osdma.PCmodel.SiteSurvey;
import com.sunjray.osdma.PCrepository.SiteSurveyRepository;
import com.sunjray.osdma.PCservice.SiteSurveyService;
import com.sunjray.osdma.constants.AWSConstants;
import com.sunjray.osdma.util.CommonUtil;
import com.sunjray.osdma.util.FileUploadUtility;

@Transactional
@Service
public class SiteSurveyServiceImpl implements SiteSurveyService {
	@Autowired
	private SiteSurveyRepository siteSurveyRepository;
	@Autowired
	FileUploadUtility fileUploadUtility;

	@Override
	public void save(@Valid List<SiteSurvey> siteSurvey) {
		siteSurvey.forEach(item -> {
			item.setCreatedOn(new Date());
			String imagePath = "";
			if (!item.getSurveyDoc().isEmpty()) {
				String fileName = "pc-site-survey" + "_" + CommonUtil.fetchTimeInMilliSeconds()
						+ AWSConstants.AWS_FILE_FORMAT;
				imagePath = fileUploadUtility.saveImage(fileName, item.getSurveyDoc(), "");
			}
			item.setSurveyDoc(imagePath);
		});
		siteSurveyRepository.saveAll(siteSurvey);
	}

	@Override
	public List<SiteSurvey> findAll() {
		return siteSurveyRepository.findAll();
	}

}
