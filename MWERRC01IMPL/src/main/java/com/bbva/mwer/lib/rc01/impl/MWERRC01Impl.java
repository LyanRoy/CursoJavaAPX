package com.bbva.mwer.lib.rc01.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.mwer.dto.test.Costumer;

/**
 * The  interface MWERRC01Impl class...
 */
public class MWERRC01Impl extends MWERRC01Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(MWERRC01Impl.class);

	@Override
	public Costumer executeObtainCostumerData(Long id) {
		Costumer costumerDto = new Costumer();

		if(id == 8) {
			return generateDataDummy(id, costumerDto);
		}else
		return null;
	}

	@Override
	public Costumer generateDataDummy(Long id, Costumer dto) {
		
		jdbcUtils.queryForMap("getCostumer", id);
		
		dto.setIdPerson(id);
		dto.setName("Rodrigo");
		dto.setLastname("Reyes Olivares");
		dto.setSurname("LyanRoy");
		dto.setEmail("rreyeso@minsait.com");
		dto.setContractnumer(null);
		dto.setRfc("REOR931215R86");
		
		return dto;
	}
	

}
