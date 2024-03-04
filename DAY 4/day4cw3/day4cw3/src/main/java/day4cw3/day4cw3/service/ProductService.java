
package day4cw3.day4cw3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day4cw3.day4cw3.model.Product;
import day4cw3.day4cw3.repository.ProductRepo;
@Service
public class ProductService {
    @Autowired
    private final ProductRepo pr;
    public ProductService(ProductRepo pr) {
        this.pr = pr;
    }
    @SuppressWarnings("null")
    public Product create(Product obj)
    {
        return pr.save(obj);
    }
    public List<Product> getAll()
    {
        return pr.findAll();
    }
    public Product getById(int id)
    {
        return pr.findById(id).orElse(null);
    }
}