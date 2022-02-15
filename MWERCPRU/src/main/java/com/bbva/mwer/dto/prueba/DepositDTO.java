package com.bbva.mwer.dto.prueba;

import com.bbva.apx.dto.AbstractDTO;

import java.util.Objects;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The DepositDTO class...
 */
public class DepositDTO extends AbstractDTO {
	private static final long serialVersionUID = 2931699728946643245L;
	
	private Long id;
	private String reference;
	private Double amount;
	private String nameBenefactor;
	private String surname;
	List<AuthorizationDTO> listAuth;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getNameBenefactor() {
		return nameBenefactor;
	}
	public void setNameBenefactor(String nameBenefactor) {
		this.nameBenefactor = nameBenefactor;
	}
	public List<AuthorizationDTO> getListAuth() {
		return listAuth;
	}
	public void setListAuth(List<AuthorizationDTO> listAuth) {
		this.listAuth = listAuth;
	}
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DepositDTO other = (DepositDTO) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "DepositoDTO [id=" + id + ", reference=" + reference + ", amount=" + amount + ", nameBenefactor="
				+ nameBenefactor + ", listAuth=" + listToString() + "]";
	}
	
	public String listToString() {
		StringBuilder sb=new StringBuilder("[  ");
		for(AuthorizationDTO dto: listAuth) {
			sb.append(dto.toString());
			sb.append("  ");
		}
		sb.append("]");
		return sb.toString();
	}
	
}
