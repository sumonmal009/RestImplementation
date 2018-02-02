package com.target.entry.entity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Report {
	String reportID;
	String patientID;
	String doctorID;
	List<Entry> doctorComment;
	public String getReportID() {
		return reportID;
	}
	public void setReportID(String reportID) {
		this.reportID = reportID;
	}
	public String getPatientID() {
		return patientID;
	}
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}
	public String getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(String doctorID) {
		this.doctorID = doctorID;
	}
	public List<Entry> getDoctorComment() {
		return doctorComment;
	}
	public void setDoctorComment(List<Entry> doctorComment) {
		this.doctorComment = doctorComment;
	}

}
