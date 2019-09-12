package com.sunjray.osdma.SMwarehouseBSRepo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.SMwarehouseBModel.ProductList;

@Service
public class ProductListDAOImpl implements ProductListDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<ProductList> findall() {
		String getdetails = "SELECT * FROM osdma.t_os_qaqc_product_code where product_status='INTRANSIT'";
		List<ProductList> productList = new ArrayList<ProductList>();
		productList = jdbcTemplate.query(getdetails, new ResultSetExtractor<List<ProductList>>() {

			@Override

			public List<ProductList> extractData(ResultSet rs) throws SQLException, DataAccessException {

				List<ProductList> prodList = new ArrayList<ProductList>();

				while (rs.next()) {
					ProductList pList = new ProductList();
					// pList.setProductList(rs.getString("product_list_id"));
					pList.setProductCode(rs.getString("product_code_gen"));
					pList.setProductName(rs.getString("product_name"));
					// pList.setDescription(rs.getString("description"));
					pList.setQuantity(rs.getInt("quantity"));
					pList.setRemark(rs.getString("product_status"));
					prodList.add(pList);

				}
				return prodList;

			}

		});

		return productList;
	}

	@Override
	public int setdetails(ProductList prod) {
		int i = 0;
		// for(ProductList p:prod)
		{ // jdbcTemplate.
			i = jdbcTemplate.update("update osdma.t_os_qaqc_product_code set storage_location='" + prod.getLocation()
					+ "', product_status='RECIVED' where product_code_gen='" + prod.getProductCode() + "'");

			// "update osdma.t_os_qaqc_product_code set location='"+p.getLocation()+"' where
			// product_code_gen='"+p.getProductCode()+"'"
		}

		return i;
	}

	@Override
	public List<ProductList> findStockInDetails() {
		String getdetails = "SELECT * FROM osdma.t_os_qaqc_product_code ";
		List<ProductList> productList = new ArrayList<ProductList>();
		productList = jdbcTemplate.query(getdetails, new ResultSetExtractor<List<ProductList>>() {

			@Override

			public List<ProductList> extractData(ResultSet rs) throws SQLException, DataAccessException {

				List<ProductList> prodList = new ArrayList<ProductList>();

				while (rs.next()) {

					ProductList pList = new ProductList();
					// pList.setProductList(rs.getString("product_list_id"));
					pList.setProductCode(rs.getString("product_code_gen"));
					pList.setProductName(rs.getString("product_name"));
					// pList.setDescription(rs.getString("description"));
					pList.setQuantity(rs.getInt("quantity"));
					pList.setRemark(rs.getString("product_status"));
					prodList.add(pList);

				}

				return prodList;

			}

		});

		return productList;
	}

	@Override
	public List<ProductList> findAssemblydetails() {
		// String getdetails = "SELECT * FROM osdma.t_os_product_item_map";
		/*
		 * List<ProductList> productList = new ArrayList<ProductList>(); productList =
		 * jdbcTemplate.query(getdetails, new ResultSetExtractor<List<ProductList>>() {
		 * 
		 * @Override
		 * 
		 * public List<ProductList> extractData(ResultSet rs) throws SQLException,
		 * DataAccessException {
		 * 
		 * List<ProductList> prodList = new ArrayList<ProductList>();
		 * 
		 * while (rs.next()) {
		 * 
		 * ProductList pList = new ProductList();
		 * 
		 * //pList.setProductList(rs.getString("product_list_id"));
		 * pList.setProductCode(rs.getString("product_code_gen"));
		 * pList.setProductName(rs.getString("product_name"));
		 * //pList.setDescription(rs.getString("description"));
		 * pList.setQuantity(rs.getInt("quantity"));
		 * 
		 * pList.setRemark(rs.getString("product_status"));
		 * 
		 * prodList.add(pList);
		 * 
		 * }
		 * 
		 * // LOGGER.info("Total Jobs: "+ jobList.size());
		 * 
		 * return prodList;
		 * 
		 * }
		 * 
		 * });
		 * 
		 * return productList;
		 */
		return null;
	}

}
