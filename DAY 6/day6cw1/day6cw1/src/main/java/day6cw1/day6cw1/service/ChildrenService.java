
package day6cw1.day6cw1.service;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import day6cw1.day6cw1.model.Children;
import day6cw1.day6cw1.repository.ChildrenRepo;

@Service
public class ChildrenService {
    private ChildrenRepo childrenRepo;
    public ChildrenService(ChildrenRepo childrenRepo){
        this.childrenRepo=childrenRepo;
    }
    @SuppressWarnings("null")
    public Children postChildren(Children children){
        return childrenRepo.save(children);
    }
    public List<Children> getChildren(String field){
        return childrenRepo.findAll(Sort.by(field));
    }
    public Page<Children> paginationChildren(int offset,int pagesize){
        return childrenRepo.findAll(PageRequest.of(offset,pagesize));
    }
    public Page<Children> pageSortChildren(int offset,int pagesize,String field){
        PageRequest pageRequest=PageRequest.of(offset, pagesize , Sort.by(field));
        return childrenRepo.findAll(pageRequest);
    }
}