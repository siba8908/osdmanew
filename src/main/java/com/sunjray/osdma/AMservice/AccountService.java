package com.sunjray.osdma.AMservice;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.sunjray.osdma.AMmodel.Consinment;
import com.sunjray.osdma.AMmodel.MaterialPurchase;

public interface AccountService {

	int addConsinment(Consinment consinment);

	List<Consinment> findAllMaterial();

	int updatetrack(Consinment consinment, HttpSession session);

	List<Consinment> findAllConsignmentNo();

	void addmaterial(MaterialPurchase materialPurchase);

	List<Consinment> getConsNo();


	

}
