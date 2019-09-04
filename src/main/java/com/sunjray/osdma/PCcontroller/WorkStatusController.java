package com.sunjray.osdma.PCcontroller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCmodel.WorkStatus;
import com.sunjray.osdma.PCservice.WorkStatusService;
import com.sunjray.osdma.util.HeaderUtil;

@RestController
@RequestMapping("pc")
public class WorkStatusController {
	
	@Resource
	WorkStatusService workStatusService;
	
	/**
     * PUT  /crop-growth-stages : update remark in WorkStatus.
     *
     * @param WorkStatus the WorkStatus to update
     * @return the ResponseEntity with status 201 (Created) and with body the new cropGrowthStage, or with status 400 (Bad Request) if the cropGrowthStage has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/update-remark-in-daily-work-status")
    public ResponseEntity<WorkStatus> updateDailyWorkStatus(@RequestBody WorkStatus updateWorkStatus) throws URISyntaxException {
    	WorkStatus result = workStatusService.updateDailyWorkStatus(updateWorkStatus);
        return ResponseEntity.created(new URI("/api/update-remark-in-daily-work-status/" + result.getWorkStatusId()))
            .headers(HeaderUtil.createEntityCreationAlert("WorkStatus", result.getWorkStatusId().toString()))
            .body(result);
    }

}
