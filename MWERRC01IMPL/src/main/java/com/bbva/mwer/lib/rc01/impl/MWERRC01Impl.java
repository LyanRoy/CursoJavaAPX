package com.bbva.mwer.lib.rc01.impl;

import java.util.Map;

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
		LOGGER.info("Entrando al metodo executeObtainCostumerData");
		
		Costumer costumerDto = new Costumer();

		//if(id == 8) {
			return generateData(id, costumerDto);
		//}else
		//return null;
	}

	@Override
	public Costumer generateData(Long id, Costumer dto) {
		LOGGER.info("Entrando al metodo generateData");
		
		
		Map<String, Object> mapCostumer = null;
		
		mapCostumer = jdbcUtils.queryForMap("getCostumer", id);
		
		/*if (mapCostumer == null || mapCostumer.isEmpty()) {
			
		}*/
		
		LOGGER.debug("El valor del mapa es vacio: {}", mapCostumer.isEmpty());

		dto.setIdPerson(Long.parseLong(mapCostumer.get("IDPERSON").toString()));
		dto.setName(mapCostumer.get("NAME").toString());
		dto.setLastname(mapCostumer.get("LASTNAME").toString());
		dto.setSurname(mapCostumer.get("SURNAME").toString());
		dto.setEmail(mapCostumer.get("EMAIL").toString());
		dto.setContractnumer((long)mapCostumer.get("CONTRACTNUMER"));
		dto.setRfc(mapCostumer.get("RFC").toString());
		
		/*
		dto.setIdPerson(id);
		dto.setName("Rodrigo");
		dto.setLastname("Reyes Olivares");
		dto.setSurname("LyanRoy");
		dto.setEmail("rreyeso@minsait.com");
		dto.setContractnumer(null);
		dto.setRfc("REOR931215R86");
		*/
		return dto;
	}

	@Override
	public int executeInsertCostumer(Costumer costumer) {
		LOGGER.info("Entrando al metodo executeInsertCostumer");
		
		Costumer costumerDto = new Costumer();
		
		jdbcUtils.queryForMap("insertCostumer", costumer);
		

		
		return 0;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
	

}
