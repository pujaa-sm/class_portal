package com.example.day9cw2.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.day9cw2.model.Recipe;
import java.util.List;


@Repository
public interface RecipeRepo extends JpaRepository<Recipe,Integer>{

    @Query("select r from Recipe r where recipeName=?1")
    List<Recipe> findByProduct(String name);
    
}