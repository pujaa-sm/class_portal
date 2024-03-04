package day4cw2.day4cw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import day4cw2.day4cw2.model.Job;

@Repository
public interface JobRepo extends JpaRepository<Job,Integer>{

    
  
}

