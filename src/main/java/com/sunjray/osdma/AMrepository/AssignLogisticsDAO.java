package com.sunjray.osdma.AMrepository;



import java.util.List;

import com.sunjray.osdma.AMmodel.AssignLogistics;
import com.sunjray.osdma.AMmodel.ConsingementTrackC2P;
import com.sunjray.osdma.AMmodel.ProPersonalDtls;

public interface AssignLogisticsDAO {
 public int insertAssginLogistics(AssignLogistics assignLogistics);
 public List<AssignLogistics> fetchConsignmenetLogisticsData();
 public List<ConsingementTrackC2P> fetchConsignmentIdNo();
	public List<ProPersonalDtls> fetchLogisticsIdName();
}
