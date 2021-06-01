package com.api.hrms.business.abstracts;

import java.util.List;

import com.api.hrms.core.results.Result;
import com.api.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	
	public Result addJobAddvertisement(JobAdvertisement jobadvertisement);
	public Result deleteJobAddvertisement(int id);
	public Result updateJobAddvertisement(JobAdvertisement jobadvertisement);
	public Result<List<JobAdvertisement>> getAllJobAddvertisement();
	public Result getJobAddvertisement(int id);
	
	
	public List<JobAdvertisement> getAllActiveJobAddverisement();
	
	Result<List<JobAdvertisement>> getAllSortedByActive();
	Result<List<JobAdvertisement>> getAllSortedByDate();
	

}
