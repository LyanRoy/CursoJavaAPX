package com.bbva.mwer;

import com.bbva.mwer.dto.test.Costumer;
import com.bbva.mwer.lib.rc01.MWERRC01;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Transaccion para la obtencion de datos de un cliente con base a su ID
 *
 */
public class MWERTC0101MXTransaction extends AbstractMWERTC0101MXTransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(MWERTC0101MXTransaction.class);

	/**
	 * The execute method...
	 */
	@Override
	public void execute() {
		MWERRC01 mwerR = this.getServiceLibrary(MWERRC01.class);
		// TODO - Implementation of business logic
		LOGGER.info("Se accedió a la transacción");
		String message=getId().toString();
		LOGGER.debug("EL valor de la entrada es: {}",message);
		

		if(getId() < 0 || getId() > 99999) {
			setOutputid("Error: Revisa el Id");
		} else {

			Costumer dto = mwerR.executeObtainCostumerData(getId());

			LOGGER.debug("El valor del objeto es: {}",dto.toString());
			
			setCostumer(dto);
		}

	}

}
