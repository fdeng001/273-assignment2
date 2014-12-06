package com.assignment2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.assignment2.dao.DataDao;
import com.assignment2.model.Employee;

public class DataServicesImpl implements DataServices {

 @Autowired
 DataDao dataDao;
 
 public boolean addEntity(Employee employee) throws Exception {
  return dataDao.addEntity(employee);
 }

 public Employee getEntityById(long id) throws Exception {
  return dataDao.getEntityById(id);
 }

 public List<Employee> getEntityList() throws Exception {
  return dataDao.getEntityList();
 }

 public boolean deleteEntity(long id) throws Exception {
  return dataDao.deleteEntity(id);
 }

}