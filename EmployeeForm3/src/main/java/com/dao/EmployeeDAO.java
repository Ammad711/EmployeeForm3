package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.entities.Employee;


@Component
public class EmployeeDAO {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int save(Employee emp) {
		Integer i=(Integer) this.hibernateTemplate.save(emp);
		return i;		
	}
	public List<Employee> getall()
	{
		List<Employee> emps = this.hibernateTemplate.loadAll(Employee.class);	
		return emps;
	}
	

}
