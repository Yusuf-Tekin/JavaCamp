package com.api.hrms.api.controller.jobadvertisement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.hrms.business.abstracts.JobAdvertisementService;
import com.api.hrms.core.results.Result;
import com.api.hrms.core.results.success.SuccessDataResult;
import com.api.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobadvertisement")
public class jobadvertisement {
	
	private JobAdvertisementService jobadvertisementservice;
	
	@Autowired
	public jobadvertisement(JobAdvertisementService jobadvertisementservice) {
		// TODO Auto-generated constructor stub
		this.jobadvertisementservice = jobadvertisementservice;
	}

	
	@GetMapping("/getAllAdvertisement")
	public Result<List<JobAdvertisement>> getAllAdvertisement(){
		return new SuccessDataResult<>("Tüm iş ilanları;",this.jobadvertisementservice.getAllJobAddvertisement());
	}
	
	
	@PostMapping("/addadvertisement")
	public Result<JobAdvertisement> addadvertisement(@RequestBody JobAdvertisement jobadvertisement){
		return new SuccessDataResult<>("İş ilanı eklendi",this.jobadvertisementservice.addJobAddvertisement(jobadvertisement));
	}
	
	@GetMapping("/activeJobAdvertisement")
	public Result<List<JobAdvertisement>> getActiveJobAdvertisement(){
		return new SuccessDataResult<>("Tüm aktif iş ilanları",this.jobadvertisementservice.getAllActiveJobAddverisement());
	}
}
