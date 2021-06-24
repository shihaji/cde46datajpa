package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

@SpringBootApplication
public class Cde46SpringJpaApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx=  SpringApplication.run(Cde46SpringJpaApplication.class, args);
	
		EmployeeRepository empRepo=ctx.getBean(EmployeeRepository.class);
		
		//List<Employee> list=empRepo.findAll(Sort.by(Sort.Direction.DESC,"name"));
		
		//for(Employee e:list) {
		//	System.out.println(e.getName());
		//}
		
		
		/*
		 * List<Employee> list=empRepo.getAllEmp();
		 * 
		 * for(Employee e:list) { System.out.println(e.getName()+"   "+e.getSalary()); }
		 */
		
		//Employee emp=empRepo.findByName("cts");
		
		
		List<Employee> list=empRepo.findByNameIn(Arrays.asList("cts","abc","xyz"));
		
		for(Employee e:list) {
			System.out.println(e.getName()+"   "+e.getSalary());
		}
	
	
	}

}
