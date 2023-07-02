package com.project.Springbootpractice.service;

import com.project.Springbootpractice.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDeparmentsList();

    public Department getDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentID);

    public Department updateDepartment(Long departmentId, Department department);
}
