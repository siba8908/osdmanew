
package com.sunjray.osdma.qaqcservice;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.sunjray.osdma.AMmodel.MaterialPurchase;
import com.sunjray.osdma.qaqcModel.MaterialCode;
import com.sunjray.osdma.qaqcModel.QaqcItem;


public interface QaqcService {

	List<MaterialPurchase> getItems();

	int saveItemdtls(QaqcItem qaqcItem, HttpSession session);

	List<MaterialCode> getcomponent();

	int updateProduct(QaqcItem qaqcItem, HttpSession session);

	Iterable<QaqcItem> getRejectList();

}
