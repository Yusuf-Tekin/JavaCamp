package com.api.hrms.api.controller.jobposition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.hrms.business.abstracts.JobPositionService;
import com.api.hrms.core.jobposition.JobPositionControl;
import com.api.hrms.core.jobposition.JobPositionControlAbs;
import com.api.hrms.core.results.Result;
import com.api.hrms.core.results.error.ErrorDataResult;
import com.api.hrms.core.results.success.SuccessDataResult;
import com.api.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/positions")
public class jobpositioncontroller{
	
	private JobPositionService jobPositionService;
	private JobPositionControlAbs jobpositionControl;

	@Autowired
	public jobpositioncontroller(JobPositionService jobPositionService,JobPositionControlAbs jobpositioncontrol) {
		super();
		this.jobPositionService = jobPositionService;
		this.jobpositionControl = jobpositioncontrol;
	}


	@GetMapping("/getAllPositions")
	public List<JobPosition> getAllPosition(){
		
		return this.jobPositionService.getAllPosition();
	}
	
	@PostMapping("/addPosition")
	public Result addPosition(@RequestBody JobPosition position) {
		if(!position.equals(null)) {
			this.jobPositionService.addPosition(position,new JobPositionControl(jobPositionService));
			return new SuccessDataResult<>("Pozisyon Kayıt Edildi");
		}
		else {
			return new ErrorDataResult<>("Böyle bir pozisyon zaten mevcut.");
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletePosition(@PathVariable int id) {
		this.jobPositionService.deletePosition(id);
	}
	
	
	
	


}
