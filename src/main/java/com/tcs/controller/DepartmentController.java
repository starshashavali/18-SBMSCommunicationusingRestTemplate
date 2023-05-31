package com.tcs.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.binding.Dept;
import com.tcs.service.DepartmentService1;

@RestController
public class DepartmentController {
     @Autowired
    private DepartmentService1 departmentService;

    @PostMapping("/save")
    public String saveDepartment(@RequestBody Dept dept){
    	
    	return departmentService.saveDepartment(dept);
    	
       
        
    }
    
    @GetMapping("/dept")
    public Dept getDetails(@RequestParam Integer id) {
    	
    	return departmentService.getById(id);
    	
    }

   
}
