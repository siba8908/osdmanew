package com.sunjray.osdma.SMwarehouseBSRepo;

import java.util.List;

import com.sunjray.osdma.SMwarehouseBModel.ProductList;

public interface ProductListDAO {

	List<ProductList> findall();

	int setdetails(ProductList prod);

	List<ProductList> findStockInDetails();

	List<ProductList> findAssemblydetails();

}
