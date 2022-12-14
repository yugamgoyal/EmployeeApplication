package com.yugamsystem.employee.repository;

import com.yugamsystem.employee.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    List<EmployeeEntity> findAllByFirstName(String name);
    EmployeeEntity findByEmailID(String email);
}
