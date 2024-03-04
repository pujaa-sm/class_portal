package day5cw1.day5cw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import day5cw1.day5cw1.model.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    
}
