package com.sunjray.osdma.PCservice;

import java.util.List;

import javax.validation.Valid;

import com.sunjray.osdma.PCmodel.SiteSurvey;

public interface SiteSurveyService {

	void save(@Valid List<SiteSurvey> siteSurvey);

	List<SiteSurvey> findAll();

}
