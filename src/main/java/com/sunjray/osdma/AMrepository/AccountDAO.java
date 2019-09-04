package com.sunjray.osdma.AMrepository;

import java.util.List;

import com.sunjray.osdma.AMmodel.Consinment;



public interface AccountDAO {

	int addConsinment(Consinment consinment);

	List<Consinment> findAllMaterial();

	int updateTrack(Consinment consinment);

	List<Consinment> findAllConsignmentNo();

	void addmaterial(String item_name, String serial_no, Integer quantity,Integer consinment_id);

	

}
