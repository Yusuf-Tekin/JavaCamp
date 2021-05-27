package com.api.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.hrms.entities.concretes.user;

public interface UserDao extends JpaRepository<user, Integer>{

}
