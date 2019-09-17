package com.sunjray.osdma.SMwarehouseBController;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCenumeration.Status;
import com.sunjray.osdma.PCmodel.MasterProduct;
import com.sunjray.osdma.PCmodel.PcMaterialRequest;
import com.sunjray.osdma.PCrepository.MaterialRequestRepository;
import com.sunjray.osdma.PMRepository.SiteLocationRepository;
import com.sunjray.osdma.PMmodel.SiteLocation;
import com.sunjray.osdma.SMmodel.ConsignmentLogistic;
import com.sunjray.osdma.SMmodel.QaqcProductCode;
import com.sunjray.osdma.SMrepository.ConsignmentLogisticRepository;
import com.sunjray.osdma.SMwarehouseAModel.SerProPersonalDtls;
import com.sunjray.osdma.SMwarehouseARepository.SerProPersonalDtlsRepository;
import com.sunjray.osdma.SMwarehouseBModel.WarhousebStockOut;
import com.sunjray.osdma.SMwarehouseBRepository.QaqcProductCodeRepository;
import com.sunjray.osdma.SMwarehouseBRepository.WarhousebStockOutRepository;
import com.sunjray.osdma.dto.AppResponse;
import com.sunjray.osdma.util.HeaderUtil;

@RestController
@RequestMapping("wb")
public class ProductController {
	@Autowired
	private QaqcProductCodeRepository qaqcProductCodeRepository;

	@Resource
	private MaterialRequestRepository materialRequestRepository;

	@Resource
	private WarhousebStockOutRepository warhousebStockOutRepository;

	@Autowired
	private SiteLocationRepository siteLocationRepository;
	
	@Autowired
	private SerProPersonalDtlsRepository serProPersonalDtlsRepository;
	
	@Autowired
	private ConsignmentLogisticRepository consignmentLogisticRepository;

	@GetMapping("/fetch-product-list")
	public List<QaqcProductCode> getAllProducts() {
		return qaqcProductCodeRepository.findByProductStatus(Status.INTRANSIT);
	}

	@GetMapping("/fetch-product-list/{productId}")
	public List<QaqcProductCode> getAllProducts(@PathVariable int productId) {
		MasterProduct masterProduct = new MasterProduct();
		masterProduct.setProductId(productId);
		return qaqcProductCodeRepository.findByMasterProduct(masterProduct);
	}

	@GetMapping("/fetch-wb-stock-in")
	public List<QaqcProductCode> getStockInProducts() {
		return qaqcProductCodeRepository.findByProductStatus(Status.RECEIVED);
	}

	@PostMapping("/update-product-stock")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<AppResponse> updateProductStock(@RequestBody QaqcProductCode qaqcProductCode)
			throws URISyntaxException {
		qaqcProductCodeRepository.save(qaqcProductCode);
		return ResponseEntity.created(new URI("/wb/update-product-stock"))
				.headers(HeaderUtil.createEntityCreationAlert("updateProductStock", "created"))
				.body(new AppResponse("success"));
	}

	@GetMapping("/fetch-wb-material-request")
	public List<PcMaterialRequest> fetchMaterialRequest() {
		return materialRequestRepository.findByStatus(Status.APPROVED);
	}

	@PostMapping("/save-stock-out")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<AppResponse> saveStockOut(@RequestBody List<WarhousebStockOut> warhousebStockOut)
			throws URISyntaxException {
		warhousebStockOutRepository.saveAll(warhousebStockOut);
		return ResponseEntity.created(new URI("/wb/save-stock-out"))
				.headers(HeaderUtil.createEntityCreationAlert("saveStockOut", "created"))
				.body(new AppResponse("success"));
	}

	@GetMapping("/fetch-stock-out")
	public List<WarhousebStockOut> getAllStockOut() {
		return warhousebStockOutRepository.findAll();
	}

	@GetMapping("/fetch-site-location")
	public List<SiteLocation> getAllSiteLocation() {
		return siteLocationRepository.findAll();
	}
	
	@GetMapping("/fetch-service-provider")
	public List<SerProPersonalDtls> getAllSerProPersonalDtls() {
		return serProPersonalDtlsRepository.findAll();
	}
	
	@PostMapping("/save-stock-out-logistics")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<AppResponse> saveStockOutLogistics(@RequestBody ConsignmentLogistic consignmentLogistic)
			throws URISyntaxException {
		consignmentLogisticRepository.save(consignmentLogistic);
		return ResponseEntity.created(new URI("/wb/save-stock-out-logistics"))
				.headers(HeaderUtil.createEntityCreationAlert("saveStockOutLogistics", "created"))
				.body(new AppResponse("success"));
	}

}
