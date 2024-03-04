package com.example.day7cw3.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.day7cw3.model.Door;

@Repository
public interface DoorRepo extends JpaRepository<Door,Integer>{
    List<Door> findByAccessType(String accessType);
}