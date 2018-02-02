package com.target.entry.persistance;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import com.target.entry.persistance.baseFeature.PersistanceFeature;

import lombok.Getter;
import lombok.Setter;

public class SpecialistRecord extends PersistanceFeature {
	@Setter
	@Getter
	public static Map<String, LinkedList<String>> doctorSpecialistTable = new HashMap<String, LinkedList<String>>(); // <Spacialist,doctorId>
}
