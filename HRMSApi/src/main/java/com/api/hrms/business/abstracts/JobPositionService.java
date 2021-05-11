package com.api.hrms.business.abstracts;

import java.util.List;

import com.api.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	
	List<JobPosition> getAllPosition();
	void addPosition(JobPosition position);
	void deletePosition(int id);
}
