package com.ex1.classwork.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ex1.classwork.model.Children;
import com.ex1.classwork.repository.ChildrenRepo;

@Service
public class ChildrenService {
    private ChildrenRepo childRepo;

    public ChildrenService(ChildrenRepo childRepo) {
        this.childRepo = childRepo;
    }
    public Children postChildren(Children children)
    {
        return childRepo.save(children);
    }
    public List<Children> getChildrens(String field)
    {
        return childRepo.findAll(Sort.by(field));
    }
    public Page<Children> childpagination(int offset,int pagesize)
    {
        return childRepo.findAll(PageRequest.of(offset, pagesize));
    }
    public Page<Children> childsortpage(int offset, int pagesize, String field) {
        PageRequest pageRequest = PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field));
        Page<Children> page=childRepo.findAll(pageRequest);
        return page;
    }
    
}