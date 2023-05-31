package com.tcs.serviceimpl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.binding.Dept;
import com.tcs.entity.Department1;
import com.tcs.repo.DepartmentRepository;
import com.tcs.service.DepartmentService1;

@Service
public class DepartmentImpl implements DepartmentService1  {
	
	@Autowired
	private DepartmentRepository deptrepo;

	public String saveDepartment(Dept department) {
		
		Department1 dept=new Department1();
		
		BeanUtils.copyProperties(department, dept);
		
		deptrepo.save(dept);
		
		return "record saved..";
	}
	public Dept getById(Integer id) {
		Optional<Department1> findById = deptrepo.findById(id);
		Dept dept=new Dept();
		if(findById.isPresent()) {
			Department1 entity = findById.get();
			dept=new Dept();
			
			BeanUtils.copyProperties(entity, dept);
			
			
			
			
		}
		
		return dept;
		
	}
}
