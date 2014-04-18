package com.josh;

import java.util.Date;

public class FeatureA {

	String featureName;
	Date dateCreated;
	Integer age; 
	Integer heightInInches;
	
	public Integer getHeightInInches() {
		return heightInInches;
	}

	public void setHeightInInches(Integer heightInInches) {
		this.heightInInches = heightInInches;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
}