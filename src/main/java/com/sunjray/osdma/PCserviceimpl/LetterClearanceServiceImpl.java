package com.sunjray.osdma.PCserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunjray.osdma.PCmodel.LetterClearance;
import com.sunjray.osdma.PCrepository.LetterClearanceRepository;
import com.sunjray.osdma.PCservice.LetterClearanceService;
import com.sunjray.osdma.constants.AWSConstants;
import com.sunjray.osdma.util.CommonUtil;
import com.sunjray.osdma.util.FileUploadUtility;


@Transactional
@Service
public class LetterClearanceServiceImpl implements LetterClearanceService {

	@Autowired
	private LetterClearanceRepository letterClearanceRepository;
	@Autowired
	FileUploadUtility fileUploadUtility;


	@Override
	public void save(List<LetterClearance> letterClearances) {
		letterClearances.forEach(item->{
			String imagePath = "";
			if (!item.getLetterDoc().isEmpty()) {
				String fileName = "pc-clearance-letter" + "_" + CommonUtil.fetchTimeInMilliSeconds() + AWSConstants.AWS_FILE_FORMAT;
				imagePath = fileUploadUtility.saveImage(fileName, item.getLetterDoc(), "");
			}
			item.setLetterDoc(imagePath);
		});
		letterClearanceRepository.saveAll(letterClearances);
	}

}
