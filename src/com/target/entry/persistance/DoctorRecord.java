package com.target.entry.persistance;

import java.util.HashMap;
import java.util.Map;

import com.target.entry.entity.Doctor;
import com.target.entry.persistance.baseFeature.PersistanceFeature;

import lombok.Getter;
import lombok.Setter;

public class DoctorRecord extends PersistanceFeature {
	@Setter
	@Getter
	public static Map<String, Doctor> doctorRecordTable = new HashMap<String, Doctor>(); // <doctorId,Doctor>
}