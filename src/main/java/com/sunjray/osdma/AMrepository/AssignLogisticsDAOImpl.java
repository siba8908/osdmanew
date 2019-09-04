package com.sunjray.osdma.AMrepository;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.mapper.AssignLogisticsResultSetExtractor;
import com.sunjray.osdma.mapper.ConsingementTrackC2PResultSetExtractor;
import com.sunjray.osdma.mapper.ProPersonalDtlsResultSetExtractor;
import com.sunjray.osdma.AMmodel.AssignLogistics;
import com.sunjray.osdma.AMmodel.ConsingementTrackC2P;
import com.sunjray.osdma.AMmodel.ProPersonalDtls;
import com.sunjray.osdma.util.QueryConstant;

@Repository
public class AssignLogisticsDAOImpl implements AssignLogisticsDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insertAssginLogistics(AssignLogistics assignLogistics)
	{
		int result;
		
		result=jdbcTemplate.update(QueryConstant.INSERT_ASSIGN_LOGISTICS_DETAILS,assignLogistics.getConsingementTrackC2P().getConsignmentId(),assignLogistics.getProPersonalDtls().getProviderId(),assignLogistics.getVechileNo(),assignLogistics.getlRNo(),assignLogistics.getWayBillNo(),assignLogistics.getExpectedArrival());
		return result;
	}

	 public List<AssignLogistics> fetchConsignmenetLogisticsData()
	 {
		 List<AssignLogistics> assignLogisticsList=null;
		 
		 assignLogisticsList=jdbcTemplate.query(QueryConstant.GET_ALLCONSIGNMENT_LOGISTICS_DETAILS,new AssignLogisticsResultSetExtractor());
		
		 return assignLogisticsList;
	 }
	 public List<ConsingementTrackC2P> fetchConsignmentIdNo()
	 {
		return jdbcTemplate.query(QueryConstant.GET_CONSIGNMENT_ID_NO,new ConsingementTrackC2PResultSetExtractor());
	 }
	 public List<ProPersonalDtls> fetchLogisticsIdName()
	 {
		 return jdbcTemplate.query(QueryConstant.GET_LOGISTIC_PROVIDER_ID_NAME,new ProPersonalDtlsResultSetExtractor()); 
	 }
}
