
package com.example.day7cw1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day7cw1.model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person,Integer>
{
    List<Person> findByAge(int age);
}