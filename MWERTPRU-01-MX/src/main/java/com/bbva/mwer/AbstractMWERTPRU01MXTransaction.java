package com.bbva.mwer;

import com.bbva.elara.transaction.AbstractTransaction;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractMWERTPRU01MXTransaction extends AbstractTransaction {

	public AbstractMWERTPRU01MXTransaction(){
	}


	/**
	 * Return value for input parameter inputId
	 */
	protected String getInputid(){
		return (String)this.getParameter("inputId");
	}

	/**
	 * Set value for String output parameter outputId
	 */
	protected void setOutputid(final String field){
		this.addParameter("outputId", field);
	}
}
