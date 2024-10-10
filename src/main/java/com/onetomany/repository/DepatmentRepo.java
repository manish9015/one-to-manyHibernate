package com.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetomany.model.Department;

@Repository
public interface DepatmentRepo extends JpaRepository<Department, Integer>{

}
