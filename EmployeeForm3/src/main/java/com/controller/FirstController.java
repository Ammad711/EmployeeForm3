package com.controller;

import java.util.List;
import java.util.regex.*;    
import java.util.*;    

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.EmployeeDAO;
import com.entities.Employee;

@Controller
public class FirstController {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	@RequestMapping("/employeeform")
	public String form()
	{
		return "employeeform";
	}
	
	@RequestMapping("/A")
	public String submit(HttpServletRequest req,Employee emp,Model map)
	{
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		String age=req.getParameter("age");
		if(name.matches( "^[A-Za-z_][A-Za-z_]{4,30}$" )==false)
		{
			map.addAttribute("msg", "invalid name");
			return "employeeform";
		}
		if(Integer.parseInt(age)<18 || Integer.parseInt(age)>60)
		{
			map.addAttribute("msg", "invalid age");
			return "employeeform";
		}
		if(phone.length()!=10)
		{
			map.addAttribute("msg", "invalid phone");
			return "employeeform";
		}
		String regex = "^(.+)@(.+)$";  
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()==false)
		{
			map.addAttribute("msg", "invalid email");
			return "employeeform";
		}
		System.out.println(name+" "+email+" "+phone+" "+age);
		emp.setName(name);
		emp.setPhone(phone);
		emp.setEmail(email);
		emp.setAge(age);
		int j=this.employeeDAO.save(emp);
		System.out.println(j);
//		map.addAttribute("msg", "User Successfully Registered");
		return "A";
	}
	
	@RequestMapping("/ViewAll")
	public String viewall(Model m)
	{
		List<Employee> list=this.employeeDAO.getall();
		m.addAttribute("emps", list);
		return "ViewAll";
	}

}
