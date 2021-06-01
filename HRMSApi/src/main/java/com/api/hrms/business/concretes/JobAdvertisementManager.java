package com.api.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.hrms.business.abstracts.JobAdvertisementService;
import com.api.hrms.core.results.Result;
import com.api.hrms.core.results.success.SuccessDataResult;
import com.api.hrms.dataAccess.abstracts.JobAdvertisementDao;
import com.api.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{
	
	
	private JobAdvertisementDao jobadvertisementdao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobadvertisementdao) {
		this.jobadvertisementdao = jobadvertisementdao;
	}

	@Override
	public Result addJobAddvertisement(JobAdvertisement jobadvertisement) {
		this.jobadvertisementdao.save(jobadvertisement);
		return new SuccessDataResult<>("İş ilanı oluşturuldu.",jobadvertisement);
	}

	@Override
	public Result deleteJobAddvertisement(@RequestBody int id) {
		this.jobadvertisementdao.deleteById(id);
		return new SuccessDataResult<JobAdvertisement>("İş ilanı silindi");
	}

	@Override
	public Result updateJobAddvertisement(JobAdvertisement jobadvertisement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<List<JobAdvertisement>> getAllJobAddvertisement() {
		return new SuccessDataResult<>("Tüm iş ilanları",this.jobadvertisementdao.findAll());
	}

	@Override
	public Result getJobAddvertisement(int id) {
		return new SuccessDataResult(id + " id'li iş ilanı",this.jobadvertisementdao.findById(id));

	}

	@Override
	public List<JobAdvertisement> getAllActiveJobAddverisement() {
		return this.jobadvertisementdao.getByActiveTrue();
	}

	@Override
	public Result<List<JobAdvertisement>> getAllSortedByActive() {
		return new SuccessDataResult("Aktiflik sıralaması",this.jobadvertisementdao.getByActiveTrue());
	}

	@Override
	public Result<List<JobAdvertisement>> getAllSortedByDate() {
		Sort sort=Sort.by(Sort.Direction.ASC,"applicationDeadline");
		
		return new SuccessDataResult("Tarihe göre listelendi",this.jobadvertisementdao.findAll(sort));
	}

}
