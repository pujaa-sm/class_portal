package day6_cw2.day6_cw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import day6_cw2.day6_cw2.model.Student;
@Repository


public interface StudentRepo extends JpaRepository<Student,Integer>{

}
