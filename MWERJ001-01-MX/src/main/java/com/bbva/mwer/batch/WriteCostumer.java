package com.bbva.mwer.batch;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import com.bbva.mwer.dto.test.Costumer;
import com.bbva.mwer.lib.rc01.MWERRC01;

public class WriteCostumer implements ItemWriter<Costumer>{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(WriteCostumer.class);
	
	//Inyeccion por el metodo set
	MWERRC01 mwerRC01;
	
	public MWERRC01 getMwerRC01() {
		return mwerRC01;
	}


	public void setMwerRC01(MWERRC01 mwerRC01) {
		this.mwerRC01 = mwerRC01;
	}


	@Override
	public void write(List<? extends Costumer> listCostumer) throws Exception {

		LOGGER.info("Ejecutando Writer del proceso");
		
		for (Costumer costumer : listCostumer) {
			mwerRC01.executeInsertCostumer(costumer);
		}
		
	}

}
