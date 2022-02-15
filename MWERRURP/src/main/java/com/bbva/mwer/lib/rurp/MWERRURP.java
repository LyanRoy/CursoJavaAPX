package com.bbva.mwer.lib.rurp;

import com.bbva.mwer.dto.pruebas.DepositDTO;

/**
 * The  interface MWERRURP class...
 */
public interface MWERRURP {

	/**
	 * The execute method...
	 */
	Integer executeSum(Integer number, Integer number2);
	Integer executeSub(Integer number, Integer number2);
	Integer execute(DepositDTO dto);
}
