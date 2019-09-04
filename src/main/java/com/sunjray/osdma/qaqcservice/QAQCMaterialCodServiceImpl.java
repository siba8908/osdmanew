package com.sunjray.osdma.qaqcservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.qaqcModel.MasterProduct;
import com.sunjray.osdma.qaqcModel.MaterialCode;
import com.sunjray.osdma.qaqcModel.QaqcItem;
import com.sunjray.osdma.qaqcRepository.QAQCMaterialCodDao;


@Service
public class QAQCMaterialCodServiceImpl implements QAQCMaterialCodService {
	
	 @Autowired
	   private QAQCMaterialCodDao QAQCdao;
	 
	/*
	 * @Override public List<QAQCMaterialCod> showMaterial() { // TODO
	 * Auto-generated method stub return QAQCdao.showMaterial(); }
	 */
	@Override
	public int QAQCMaterialCod(MaterialCode qaqcMaterialCod) {
		// use DAO
	      return QAQCdao.save(qaqcMaterialCod);

	}
	
	
	@Override
	public List<QaqcItem> getProduct_Code() {
		return QAQCdao.findAllProduct_Code();
	}

	
	@Override
	public List<MasterProduct> getProduct_Name() {
		return QAQCdao.findAllProduct_Name();
	}


	@Override
	public Iterable<QaqcItem> getMaterialCheckedList() {
		// TODO Auto-generated method stub
		return QAQCdao.getMaterialCheckedList();
	}

}
