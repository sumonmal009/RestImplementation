package com.target.entry.entity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Report {
	int reportID;
	int patientID;
	int doctorID;
	List<Entry> doctorComment;
	public int getReportID() {
		return reportID;
	}
	public void setReportID(int reportID) {
		this.reportID = reportID;
	}
	public int getPatientID() {
		return patientID;
	}
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	public int getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}
	public List<Entry> getDoctorComment() {
		return doctorComment;
	}
	public void setDoctorComment(List<Entry> doctorComment) {
		this.doctorComment = doctorComment;
	}

}
