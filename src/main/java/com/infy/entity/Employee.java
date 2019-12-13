package com.infy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String unit;
	private String typeOfProject;
	private String noofkeyresourcesneeded;
	private String noOfPCsRequired;
	private String anyProjectspecificSoftwareRequirement;
	private String servicePriority;
	private String recoveryTimelines;
	private String primaryLocation;
	private String relocationLocation;
	private String primaryBuilding;
	private String relocationBuilding;
	private String keyContact;
	private String backupKeyContact;
	private String remarks;
	private String dataReviewedBy;
	private String isWorkfromHomePossible;
	private String eccAccomodationNeeded;

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getTypeOfProject() {
		return typeOfProject;
	}

	public void setTypeOfProject(String typeOfProject) {
		this.typeOfProject = typeOfProject;
	}

	public String getNoofkeyresourcesneeded() {
		return noofkeyresourcesneeded;
	}

	public void setNoofkeyresourcesneeded(String noofkeyresourcesneeded) {
		this.noofkeyresourcesneeded = noofkeyresourcesneeded;
	}

	public String getNoOfPCsRequired() {
		return noOfPCsRequired;
	}

	public void setNoOfPCsRequired(String noOfPCsRequired) {
		this.noOfPCsRequired = noOfPCsRequired;
	}

	public String getAnyProjectspecificSoftwareRequirement() {
		return anyProjectspecificSoftwareRequirement;
	}

	public void setAnyProjectspecificSoftwareRequirement(String anyProjectspecificSoftwareRequirement) {
		this.anyProjectspecificSoftwareRequirement = anyProjectspecificSoftwareRequirement;
	}

	public String getServicePriority() {
		return servicePriority;
	}

	public void setServicePriority(String servicePriority) {
		this.servicePriority = servicePriority;
	}

	public String getRecoveryTimelines() {
		return recoveryTimelines;
	}

	public void setRecoveryTimelines(String recoveryTimelines) {
		this.recoveryTimelines = recoveryTimelines;
	}

	public String getPrimaryLocation() {
		return primaryLocation;
	}

	public void setPrimaryLocation(String primaryLocation) {
		this.primaryLocation = primaryLocation;
	}

	public String getRelocationLocation() {
		return relocationLocation;
	}

	public void setRelocationLocation(String relocationLocation) {
		this.relocationLocation = relocationLocation;
	}

	public String getPrimaryBuilding() {
		return primaryBuilding;
	}

	public void setPrimaryBuilding(String primaryBuilding) {
		this.primaryBuilding = primaryBuilding;
	}

	public String getRelocationBuilding() {
		return relocationBuilding;
	}

	public void setRelocationBuilding(String relocationBuilding) {
		this.relocationBuilding = relocationBuilding;
	}

	public String getKeyContact() {
		return keyContact;
	}

	public void setKeyContact(String keyContact) {
		this.keyContact = keyContact;
	}

	public String getBackupKeyContact() {
		return backupKeyContact;
	}

	public void setBackupKeyContact(String backupKeyContact) {
		this.backupKeyContact = backupKeyContact;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getDataReviewedBy() {
		return dataReviewedBy;
	}

	public void setDataReviewedBy(String dataReviewedBy) {
		this.dataReviewedBy = dataReviewedBy;
	}

	public String getIsWorkfromHomePossible() {
		return isWorkfromHomePossible;
	}

	public void setIsWorkfromHomePossible(String isWorkfromHomePossible) {
		this.isWorkfromHomePossible = isWorkfromHomePossible;
	}

	public String getEccAccomodationNeeded() {
		return eccAccomodationNeeded;
	}

	public void setEccAccomodationNeeded(String eccAccomodationNeeded) {
		this.eccAccomodationNeeded = eccAccomodationNeeded;
	}

	public String getTransportRequirements() {
		return transportRequirements;
	}

	public void setTransportRequirements(String transportRequirements) {
		this.transportRequirements = transportRequirements;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private String transportRequirements;

	protected Employee() {
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", unit=" + unit + ", typeOfProject=" + typeOfProject
				+ ", noofkeyresourcesneeded=" + noofkeyresourcesneeded + ", noOfPCsRequired=" + noOfPCsRequired
				+ ", anyProjectspecificSoftwareRequirement=" + anyProjectspecificSoftwareRequirement
				+ ", servicePriority=" + servicePriority + ", recoveryTimelines=" + recoveryTimelines
				+ ", primaryLocation=" + primaryLocation + ", relocationLocation=" + relocationLocation
				+ ", primaryBuilding=" + primaryBuilding + ", relocationBuilding=" + relocationBuilding
				+ ", keyContact=" + keyContact + ", backupKeyContact=" + backupKeyContact + ", remarks=" + remarks
				+ ", dataReviewedBy=" + dataReviewedBy + ", isWorkfromHomePossible=" + isWorkfromHomePossible
				+ ", eccAccomodationNeeded=" + eccAccomodationNeeded + ", transportRequirements="
				+ transportRequirements + "]";
	}

	public Long getId() {
		return id;
	}

}