package com.bbva.mwer.dto.test;

import com.bbva.apx.dto.AbstractDTO;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The Costumer class...
 */
public class Costumer extends AbstractDTO {
	private static final long serialVersionUID = 2931699728946643245L;

	/* Attributes section for the DTO */

	/**
	 * The name attribute
	 */
	private String name;

	/**
	 * The surname attribute
	 */
	private String surname;

	/**
	 * Get the name attribute
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the name attribute
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Get the surname attribute
	 */
	public String getSurname() {
		return this.surname;
	}

	/**
	 * Set the surname attribute
	 */
	public void setSurname(final String surname) {
		this.surname = surname;
	}

	/**
	 * Indicates whether some other object is "equal to" this one.
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final Costumer rhs = (Costumer) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(name, rhs.name)
					.append(surname, rhs.surname)
					.isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.name)
			.append(this.surname)
			.toHashCode();
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("name", name)
			.append("surname", surname)
			.toString();
	}
}
