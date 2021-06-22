package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Cde46SpringJpaApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx=  SpringApplication.run(Cde46SpringJpaApplication.class, args);
	
		EmployeeRepository empRepo=ctx.getBean(EmployeeRepository.class);
		
		Employee emp=empRepo.findById(1).get();
		
		emp.setName("cts");
		
		empRepo.save(emp);
		
		
		
		
	
	
	}

}
