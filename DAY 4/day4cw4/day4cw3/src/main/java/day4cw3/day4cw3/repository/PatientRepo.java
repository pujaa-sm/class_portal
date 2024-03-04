package day4cw3.day4cw3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import day4cw3.day4cw3.model.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Integer>{

    
  
}
