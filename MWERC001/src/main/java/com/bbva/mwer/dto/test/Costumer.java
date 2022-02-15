package com.bbva.mwer.dto.test;

import com.bbva.apx.dto.AbstractDTO;

import java.util.Objects;


/**
 * The Costumer class...
 */
public class Costumer extends AbstractDTO {
	private static final long serialVersionUID = 2931699728946643245L;

	private Long idPerson;
	private String name;
	private String surname;
	private String lastname;
	private String rfc;
	private Long contractnumer;
	private String email;
	public Long getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public Long getContractnumer() {
		return contractnumer;
	}
	public void setContractnumer(Long contractnumer) {
		this.contractnumer = contractnumer;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idPerson);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Costumer other = (Costumer) obj;
		return Objects.equals(idPerson, other.idPerson);
	}
	@Override
	public String toString() {
		return "Costumer [idPerson=" + idPerson + ", name=" + name + ", surname=" + surname + ", lastname=" + lastname
				+ ", rfc=" + rfc + ", contractnumer=" + contractnumer + ", email=" + email + "]";
	}
	
	
	
	
}
