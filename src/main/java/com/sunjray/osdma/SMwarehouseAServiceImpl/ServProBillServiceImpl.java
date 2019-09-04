package com.sunjray.osdma.SMwarehouseAServiceImpl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.SMwarehouseAModel.ServProBill;
import com.sunjray.osdma.SMwarehouseARepository.ServProBillRepository;
import com.sunjray.osdma.SMwarehouseAService.ServProBillService;
import com.sunjray.osdma.constants.AWSConstants;
import com.sunjray.osdma.util.CommonUtil;
import com.sunjray.osdma.util.FileUploadUtility;

@Service
public class ServProBillServiceImpl implements ServProBillService {

	@Autowired
	private ServProBillRepository servProBillRepository;

	@Autowired
	FileUploadUtility fileUploadUtility;

	@Override
	public void save(@Valid ServProBill servProBill) {
		String imagePath = "";
		if (!servProBill.getServProvBillDocs().stream().findFirst().get().getBillFile().isEmpty()) {
			String fileName = "servProBill" + "_" + CommonUtil.fetchTimeInMilliSeconds() + AWSConstants.AWS_FILE_FORMAT;
			imagePath = fileUploadUtility.saveImage(fileName,
					servProBill.getServProvBillDocs().stream().findFirst().get().getBillFile(), "");
		}
		servProBill.getServProvBillDocs().stream().findFirst().get().setBillFile(imagePath);
		servProBillRepository.save(servProBill);
	}
}
