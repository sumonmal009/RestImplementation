package com.target.entry.entity;

import java.sql.Time;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Entry {
	int doctorID;
	Time time;
	String note;
	public int getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}
