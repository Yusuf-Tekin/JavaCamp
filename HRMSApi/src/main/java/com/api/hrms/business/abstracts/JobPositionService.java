package com.api.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.hrms.core.jobposition.JobPositionControl;
import com.api.hrms.core.results.Result;
import com.api.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	
	List<JobPosition> getAllPosition();
	void addPosition(JobPosition position,JobPositionControl jobpositioncontrol);
	void deletePosition(Integer id);
}
