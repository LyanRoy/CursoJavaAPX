package com.bbva.mwer.batch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.bbva.mwer.dto.test.Costumer;

public class CostumerFieldSetMapper implements FieldSetMapper<Costumer>{

	@Override
	public Costumer mapFieldSet(FieldSet fs) throws BindException {
		Costumer costumer = new Costumer();
		
		costumer.setIdPerson(fs.readLong("idPerson"));
		costumer.setName(fs.readString("name"));
		costumer.setSurname(fs.readString("surname"));
		costumer.setLastname(fs.readString("lastname"));
		costumer.setRfc(fs.readString("rfc"));
		costumer.setContractnumer(fs.readLong("contractnumer"));
		costumer.setEmail(fs.readString("email"));

		return costumer;
	}

}
