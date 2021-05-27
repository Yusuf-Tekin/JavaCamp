package com.api.hrms.core.jobposition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.hrms.business.abstracts.JobPositionService;
import com.api.hrms.entities.concretes.JobPosition;

@Component
public class JobPositionControl implements JobPositionControlAbs{

	private JobPositionService jobpositionservice;
	
	@Autowired
	public JobPositionControl(JobPositionService jobPositionService) {
		// TODO Auto-generated constructor stub
		this.jobpositionservice = jobPositionService;
	}
	
	@Override
	public boolean isTherePosition(String positionname) {
		boolean status = false;
		for(JobPosition position : this.jobpositionservice.getAllPosition()) {
			if(positionname == position.getPositionname()) {
				System.out.println(position.getPositionname());
				status = true;
				break;
			}
			status = false;
		}
		return status;
	}

}
