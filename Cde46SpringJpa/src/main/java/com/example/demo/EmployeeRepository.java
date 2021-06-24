package com.example.demo;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	@Query("select e from Employee e where e.salary>?1")
	public List<Employee> getEmpAsSalary(int salary);
	
	@Query("select e from Employee e where e.id>:id")
	public List<Employee> getEmpAsid(int id);
	
	@Query(value = "select * from employee",nativeQuery = true)
	public List<Employee> getAllEmp();
		
	
	public Employee findByName(String name);
	
	
	public Employee findByNameAndId(String name,int id);
	
	
	public List<Employee> getByNameOrSalary(String name,int salary);
	
	public List<Employee> findBySalaryBetween(int start,int end);
	
	public List<Employee> findBySalaryLessThan(int salary);
	
	public List<Employee> findBySalaryGreaterThan(int salary);
	
	public List<Employee> findByNameIsNull();
	
	public List<Employee> findByNameNotNull();
	
	public List<Employee> findByNameLike(String pattern);
	

	public List<Employee> findByNameNotLike(String pattern);
	
	public List<Employee> findByNameNot(String name);
	
	public List<Employee> findByNameNotIn(Collection<String> list);
	
	public List<Employee> findByNameIn(Collection<String> list);
}
