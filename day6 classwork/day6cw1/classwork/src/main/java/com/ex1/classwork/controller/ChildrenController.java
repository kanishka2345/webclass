package com.ex1.classwork.controller;

import org.springframework.web.bind.annotation.RestController;

import com.ex1.classwork.model.Children;
import com.ex1.classwork.service.ChildrenService;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ChildrenController {
    private ChildrenService childService;

    public ChildrenController(ChildrenService childService) {
        this.childService = childService;
    }
    
    @PostMapping("/api/children")
    public ResponseEntity<Children> postchild(@RequestBody Children children) {
        Children ch = childService.postChildren(children);
        if (ch != null) {
            return new ResponseEntity<>(ch, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/api/children/sortBy/{field}")
    public ResponseEntity<List<Children>> getch(@PathVariable("field") String field) {
        List<Children> lich = childService.getChildrens(field);
        if (lich != null) {
            return new ResponseEntity<>(lich, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @GetMapping("/api/children/{offset}/{pagesize}")
    public ResponseEntity<Page<Children>> getpagechild(@PathVariable("offset") int offset, @PathVariable("pagesize") int pagesize) {
        Page<Children> page = childService.childpagination(offset, pagesize);
        if (page != null) {
            return new ResponseEntity<>(page, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @GetMapping("/api/children/{offset}/{pagesize}/{field}")
    public ResponseEntity<Page<Children>> getpagesort(@PathVariable("offset") int offset, @PathVariable("pagesize") int pagesize, @PathVariable("field") String field) {
        Page<Children> ps = childService.childsortpage(offset, pagesize, field);
        if (ps != null) {
            return new ResponseEntity<>(ps, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
