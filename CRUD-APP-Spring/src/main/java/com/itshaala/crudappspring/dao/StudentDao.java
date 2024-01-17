package com.itshaala.crudappspring.dao;

import com.itshaala.crudappspring.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentDao extends JpaRepository<Student,Integer> {
}
