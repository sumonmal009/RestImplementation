package com.target.entry.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Patient {
	int patientID;
	String patientName;
	String patientAddress;
	int patientPhone;
	int patientReportID;
	
	public int getPatientID() {
		return patientID;
	}
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public int getPatientPhone() {
		return patientPhone;
	}
	public void setPatientPhone(int patientPhone) {
		this.patientPhone = patientPhone;
	}
	public int getPatientReportID() {
		return patientReportID;
	}
	public void setPatientReportID(int patientReportID) {
		this.patientReportID = patientReportID;
	}
}
