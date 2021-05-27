package com.api.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.hrms.entities.concretes.job_seeker_users;

public interface JobSeekerDao extends JpaRepository<job_seeker_users, Integer> {

}
