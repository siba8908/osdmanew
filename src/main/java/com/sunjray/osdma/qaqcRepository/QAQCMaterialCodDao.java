package com.sunjray.osdma.qaqcRepository;

import java.util.List;

import com.sunjray.osdma.qaqcModel.MasterProduct;
import com.sunjray.osdma.qaqcModel.MaterialCode;
import com.sunjray.osdma.qaqcModel.QaqcItem;

public interface QAQCMaterialCodDao {

	public int save(MaterialCode qaqcMaterialCod);

	//public List<QAQCMaterialCod> showMaterial();

	public List<QaqcItem> findAllProduct_Code();

	public List<MasterProduct> findAllProduct_Name();

	public Iterable<QaqcItem> getMaterialCheckedList();
}
