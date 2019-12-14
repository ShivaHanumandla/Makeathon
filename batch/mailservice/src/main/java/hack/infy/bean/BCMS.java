package hack.infy.bean;

import org.springframework.stereotype.Component;

@Component
public class BCMS {

    private String id;
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
    private String isWorkFromHomePossible;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getIsWorkFromHomePossible() {
        return isWorkFromHomePossible;
    }

    public void setIsWorkFromHomePossible(String isWorkFromHomePossible) {
        this.isWorkFromHomePossible = isWorkFromHomePossible;
    }
}
