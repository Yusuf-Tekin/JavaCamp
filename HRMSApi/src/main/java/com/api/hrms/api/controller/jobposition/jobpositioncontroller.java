package com.api.hrms.api.controller.jobposition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.hrms.business.abstracts.JobPositionService;
import com.api.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/positions")
public class jobpositioncontroller{
	
	private JobPositionService jobPositionService;

	@Autowired
	public jobpositioncontroller(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}


	@GetMapping("/getAllPositions")
	public List<JobPosition> getAllPosition(){
		
		return this.jobPositionService.getAllPosition();
	}
	
	@PostMapping("/addPosition")
	public String addPosition(@RequestBody JobPosition position) {
		if(position != null) {
			this.jobPositionService.addPosition(position);
			return "Pozisyon Eklendi";
		}
		else {
			return "Pozisyon bilgisi boş bırakılamaz";
		}
	}
	
	
	
	


}
