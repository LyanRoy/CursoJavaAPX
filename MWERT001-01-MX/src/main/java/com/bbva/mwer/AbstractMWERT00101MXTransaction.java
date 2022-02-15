package com.bbva.mwer;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.mwer.dto.prueba.DespositDTO;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractMWERT00101MXTransaction extends AbstractTransaction {

	public AbstractMWERT00101MXTransaction(){
	}


	/**
	 * Return value for input parameter DepositDTO
	 */
	protected DespositDTO getDepositdto(){
		return (DespositDTO)this.getParameter("DepositDTO");
	}
}
