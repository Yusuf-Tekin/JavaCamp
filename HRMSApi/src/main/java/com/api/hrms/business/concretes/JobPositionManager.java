package com.api.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.hrms.business.abstracts.JobPositionService;
import com.api.hrms.dataAccess.abstracts.JobPositionDao;
import com.api.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{

	
	private JobPositionDao jobpositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobpositionDao) {
		super();
		this.jobpositionDao = jobpositionDao;
	}

	@Override
	public List<JobPosition> getAllPosition() {
		// TODO Auto-generated method stub
		return this.jobpositionDao.findAll();
	}

	@Override
	public void addPosition(JobPosition position) {
		this.jobpositionDao.save(position);
	}

	@Override
	public void deletePosition(int id) {
		
		
	}

}
