package com.assignment2.dao;

import java.util.List;  

import com.assignment2.model.Employee;  
  
public interface DataDao {  
  
 public boolean addEntity(Employee employee) throws Exception;  
 public Employee getEntityById(long id) throws Exception;  
 public List<Employee> getEntityList() throws Exception;  
 public boolean deleteEntity(long id) throws Exception;  
}  