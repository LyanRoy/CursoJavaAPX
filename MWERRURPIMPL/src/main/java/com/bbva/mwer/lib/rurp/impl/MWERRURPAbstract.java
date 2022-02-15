package com.bbva.mwer.lib.rurp.impl;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.mwer.lib.rurp.MWERRURP;

/**
 * This class automatically defines the libraries and utilities that it will use.
 */
public abstract class MWERRURPAbstract extends AbstractLibrary implements MWERRURP {

	protected ApplicationConfigurationService applicationConfigurationService;


	/**
	* @param applicationConfigurationService the this.applicationConfigurationService to set
	*/
	public void setApplicationConfigurationService(ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}

}