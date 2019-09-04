package com.sunjray.osdma.AMservice;



import java.util.List;

import com.sunjray.osdma.AMmodel.AssignLogistics;
import com.sunjray.osdma.AMmodel.ConsingementTrackC2P;
import com.sunjray.osdma.AMmodel.ProPersonalDtls;

public interface AssignLogisticsService {
	public String insertAssignLogistics(AssignLogistics assignLogistics);
	public List<AssignLogistics> getConsignmenetLogisticsData();
	public List<ConsingementTrackC2P> getConsignmentIdNo();
	public List<ProPersonalDtls> getLogisticsIdName();
}
