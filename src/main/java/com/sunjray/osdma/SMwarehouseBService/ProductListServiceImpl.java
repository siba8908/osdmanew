package com.sunjray.osdma.SMwarehouseBService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.SMwarehouseBModel.ProductList;
import com.sunjray.osdma.SMwarehouseBSRepo.ProductListDAO;

@Service
public class ProductListServiceImpl implements ProductListService {

	@Autowired
	private ProductListDAO productListdao;

	@Override
	public List<ProductList> getdetails() {
		return productListdao.findall();
	}

	@Override
	public int setdetails(ProductList prod) {
		return productListdao.setdetails(prod);
	}

	@Override
	public List<ProductList> stockInDetails() {
		return productListdao.findStockInDetails();
	}

	@Override
	public List<ProductList> getAssemblydetails(String pcode) {
		return productListdao.findAssemblydetails();
	}

}
