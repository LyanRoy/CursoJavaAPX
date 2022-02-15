package com.bbva.mwer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.mwer.dto.prueba.DepositDTO;

/**
 * PRueba ambiente apx
 *
 */
public class MWERTPRU01MXTransaction extends AbstractMWERTPRU01MXTransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(MWERTPRU01MXTransaction.class);

	/**
	 * The execute method...
	 */
	@Override
	public void execute() {
		
		LOGGER.info("Se esta entrando al modo execute en la transaccion");
		
		String entrada = getInputid();
		
		LOGGER.debug("El valor de la entrada es: {}",entrada);
		
		DepositDTO deposit = getDepositdto();
		LOGGER.debug("El valor del objeto es: ",deposit.toString());
		
		String salida = "Hola " + entrada +", bienvenido a APX!";
		
		setOutputid(salida);
		
		// TODO - Implementation of business logic
	}

}
