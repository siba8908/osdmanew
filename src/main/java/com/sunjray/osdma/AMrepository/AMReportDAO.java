package com.sunjray.osdma.AMrepository;

import java.util.List;

import com.sunjray.osdma.AMmodel.ConsingementTrackP2A;
import com.sunjray.osdma.AMmodel.Consinment;
import com.sunjray.osdma.AMmodel.Expence;
import com.sunjray.osdma.AMmodel.ServProBill;
import com.sunjray.osdma.AMmodel.SiteCode;

public interface AMReportDAO {

	Iterable<ServProBill> getLedgerList();

	Iterable<Consinment> getTrackingc2p();

	Iterable<ConsingementTrackP2A> getTrackingp2a();
	
	List<SiteCode> getAllSiteCode();

	Expence ExpencesReport(SiteCode sitecode);

}
