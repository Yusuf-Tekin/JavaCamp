package com.api.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.hrms.entities.concretes.employer_users;

public interface EmployerDao extends JpaRepository<employer_users, Integer>{

}
