package com.sunjray.osdma.SMwarehouseARepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunjray.osdma.PCenumeration.Quality;
import com.sunjray.osdma.SMwarehouseAModel.QaqcItems;

public interface QaqcItemsRepository  extends JpaRepository<QaqcItems, Long> {

	List<QaqcItems> findByQuality(Quality faulty);

}
