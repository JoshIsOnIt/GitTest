package com.josh;

/**
 * FeatureB is a great Feature!
 * @author jblinick
 *
 */
public class FeatureB {

	// these are just two nice variables
	String vara;
	String varb;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vara == null) ? 0 : vara.hashCode());
		result = prime * result + ((varb == null) ? 0 : varb.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FeatureB other = (FeatureB) obj;
		if (vara == null) {
			if (other.vara != null)
				return false;
		} else if (!vara.equals(other.vara))
			return false;
		if (varb == null) {
			if (other.varb != null)
				return false;
		} else if (!varb.equals(other.varb))
			return false;
		return true;
	}

	public String getVara() {
		return vara;
	}

	public void setVara(String vara) {
		this.vara = vara;
	}

	public String getVarb() {
		return varb;
	}

	public void setVarb(String varb) {
		this.varb = varb;
	}

}