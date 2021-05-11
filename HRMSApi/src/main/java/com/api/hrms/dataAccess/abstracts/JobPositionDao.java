package com.api.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer>{

}
