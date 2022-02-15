package com.bbva.mwer.dto.prueba;

import java.util.Objects;

import com.bbva.apx.dto.AbstractDTO;

public class AuthorizationDTO {

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long authNumber;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAuthNumber() {
		return authNumber;
	}
	public void setAuthNumber(Long authNumber) {
		this.authNumber = authNumber;
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
		AuthorizationDTO other = (AuthorizationDTO) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "AuthorizationDTO [id=" + id + ", authNumber=" + authNumber + "]";
	}
	
}
