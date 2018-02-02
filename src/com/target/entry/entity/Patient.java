package com.target.entry.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Patient {
	String patientID;
	String patientName;
	String patientdeleteress;
	int patientPhone;
	int patientReportID;
	
	public String getPatientID() {
		return patientID;
	}
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientdeleteress() {
		return patientdeleteress;
	}
	public void setPatientdeleteress(String patientdeleteress) {
		this.patientdeleteress = patientdeleteress;
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
