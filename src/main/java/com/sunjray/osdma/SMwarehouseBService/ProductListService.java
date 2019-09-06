package com.sunjray.osdma.SMwarehouseBService;

import java.util.List;

import com.sunjray.osdma.SMwarehouseBModel.ProductList;

public interface ProductListService {

	List<ProductList> getdetails();

	int setdetails(ProductList prod);

	List<ProductList> stockInDetails();

	List<ProductList> getAssemblydetails(String pcode);

}
