package com.sunjray.osdma.qaqcRepository;

import java.util.List;

import com.sunjray.osdma.AMmodel.MaterialPurchase;
import com.sunjray.osdma.qaqcModel.MaterialCode;
import com.sunjray.osdma.qaqcModel.QaqcItem;



public interface QaQcDAO {

	List<MaterialPurchase> getItem();

	int addItems(QaqcItem qaqcItem);

	List<MaterialCode> getComponent();

	int getProduct(QaqcItem qaqcItem);

	Iterable<QaqcItem> getRejectList();

	

}
