package com.target.entry.persistance;

import java.util.HashMap;
import java.util.Map;

import com.target.entry.entity.Patient;
import com.target.entry.persistance.baseFeature.PersistanceFeature;

import lombok.Getter;
import lombok.Setter;

public class PatientRecord extends PersistanceFeature {
	@Setter
	@Getter
	Map<String, Patient> patientRecordTable = new HashMap<String, Patient>(); // <patientId,Patient>
}
