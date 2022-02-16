package com.bbva.mwer.lib.rc01;

import com.bbva.mwer.dto.test.Costumer;

/**
 * The  interface MWERRC01 class...
 */
public interface MWERRC01 {

	/**
	 * The execute method...
	 */
	//void execute();
	
	Costumer executeObtainCostumerData(Long id);
	
	Costumer generateData(Long id, Costumer dto);
	
	int executeInsertCostumer(Costumer costumer);

}
