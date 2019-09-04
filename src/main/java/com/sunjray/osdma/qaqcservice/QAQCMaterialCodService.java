package com.sunjray.osdma.qaqcservice;

import java.util.List;

import com.sunjray.osdma.qaqcModel.MasterProduct;
import com.sunjray.osdma.qaqcModel.MaterialCode;
import com.sunjray.osdma.qaqcModel.QaqcItem;

public interface QAQCMaterialCodService {

	public int QAQCMaterialCod(MaterialCode qaqcMaterialCod);

     // List<QAQCMaterialCod> showMaterial();

      List<QaqcItem> getProduct_Code();

	 List<MasterProduct> getProduct_Name();

	public Iterable<QaqcItem> getMaterialCheckedList();
	
	
	
	} 
		
	

