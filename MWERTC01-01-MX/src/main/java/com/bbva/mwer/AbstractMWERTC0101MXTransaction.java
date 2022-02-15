package com.bbva.mwer;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.mwer.dto.test.Costumer;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractMWERTC0101MXTransaction extends AbstractTransaction {

	public AbstractMWERTC0101MXTransaction(){
	}


	/**
	 * Return value for input parameter id
	 */
	protected Long getId(){
		return (Long)this.getParameter("id");
	}

	/**
	 * Set value for String output parameter outputId
	 */
	protected void setOutputid(final String field){
		this.addParameter("outputId", field);
	}

	/**
	 * Set value for Costumer output parameter Costumer
	 */
	protected void setCostumer(final Costumer field){
		this.addParameter("Costumer", field);
	}
}
