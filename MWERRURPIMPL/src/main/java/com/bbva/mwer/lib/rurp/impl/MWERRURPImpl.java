package com.bbva.mwer.lib.rurp.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.mwer.dto.pruebas.DepositDTO;

/**
 * The  interface MWERRURPImpl class...
 */
public class MWERRURPImpl extends MWERRURPAbstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(MWERRURPImpl.class);

	@Override
	public Integer executeSum(Integer number, Integer number2) {
		LOGGER.info("Se está ejecutando la suma");
		return number+number2;
	}

	@Override
	public Integer executeSub(Integer number, Integer number2) {
		LOGGER.info("Se está ejecutando la resta");
		return number-number2;
	}

	@Override
	public Integer execute(DepositDTO dto) {
		LOGGER.info("Se hizo el déposito: {}", dto);
		unMetodoMas();
		return 1;
	}

	private Integer unMetodoMas() {
		return 0;
	}
}
