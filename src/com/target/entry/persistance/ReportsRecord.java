package com.target.entry.persistance;

import java.util.HashMap;
import java.util.Map;

import com.target.entry.entity.Report;
import com.target.entry.persistance.baseFeature.PersistanceFeature;

import lombok.Getter;
import lombok.Setter;

public class ReportsRecord extends PersistanceFeature {
	@Setter
	@Getter
	Map<String, Report> reportsRecordTable = new HashMap<String, Report>(); // <reportId,Report>
}
