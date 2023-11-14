package com.csumb.cst363;

/*
 * This class is used to transfer data to/from prescription template pages.
 */
public class Prescription {
	
	private String rxid;  // primary key generated by database.
	// following fields are set when doctor creates a prescription.
	private String drugName;
	private int quantity;
	private int patient_id;
	private String patientFirstName;
	private String patientLastName;
	private int doctor_id;
	private String doctorFirstName;
	private String doctorLastName;
	private String dateCreated;
	// following fields will be null or blank until prescription has been filled.
	private int pharmacyID;    
	private String pharmacyAddress; 
	private String pharmacyPhone;
	private String pharmacyName;
	private String dateFilled;    
	private String cost;
	
	
	public String getRxid() {
		return rxid;
	}
	public void setRxid(String rxid) {
		this.rxid = rxid;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getPatientFirstName() {
		return patientFirstName;
	}
	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}
	public String getPatientLastName() {
		return patientLastName;
	}
	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getDoctorFirstName() {
		return doctorFirstName;
	}
	public void setDoctorFirstName(String doctorFirstName) {
		this.doctorFirstName = doctorFirstName;
	}
	public String getDoctorLastName() {
		return doctorLastName;
	}
	public void setDoctorLastName(String doctorLastName) {
		this.doctorLastName = doctorLastName;
	}
	public int getPharmacyID() {
		return pharmacyID;
	}
	public void setPharmacyID(int pharmacyID) {
		this.pharmacyID = pharmacyID;
	}
	public String getPharmacyAddress() {
		return pharmacyAddress;
	}
	public void setPharmacyAddress(String pharmacyAddress) {
		this.pharmacyAddress = pharmacyAddress;
	}
	public String getPharmacyPhone() {
		return pharmacyPhone;
	}
	public void setPharmacyPhone(String pharmacyPhone) {
		this.pharmacyPhone = pharmacyPhone;
	}
	public String getPharmacyName() {
		return pharmacyName;
	}
	public void setPharmacyName(String pharmacyName) {
		this.pharmacyName = pharmacyName;
	}
	public String getDateFilled() {
		return dateFilled;
	}
	public void setDateFilled(String dateFilled) {
		this.dateFilled = dateFilled;
	}
	public String  getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	@Override
	public String toString() {
		return "Prescription [rxid=" + rxid + ", drugName=" + drugName + ", quantity=" + quantity + ", patient_id="
				+ patient_id + ", patientFirstName=" + patientFirstName + ", patientLastName=" + patientLastName
				+ ", doctor_id=" + doctor_id + ", doctorFirstName=" + doctorFirstName + ", doctorLastName="
				+ doctorLastName + ", dateCreated=" + dateCreated + ", pharmacyID=" + pharmacyID + ", pharmacyAddress="
				+ pharmacyAddress + ", pharmacyPhone=" + pharmacyPhone + ", pharmacyName=" + pharmacyName
				+ ", dateFilled=" + dateFilled + ", cost=" + cost + "]";
	}

}
