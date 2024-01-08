package com.example.emsreactbackend.service.impl;

import com.example.emsreactbackend.dto.EmployeeDto;
import com.example.emsreactbackend.entity.Employee;
import com.example.emsreactbackend.exception.NotFound;
import com.example.emsreactbackend.mapper.EmployeeMapper;
import com.example.emsreactbackend.repository.EmployeeRepo;
import com.example.emsreactbackend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepo employeeRepo;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee saved = employeeRepo.save(employee);
        return EmployeeMapper.mapToEmployeeDto(saved);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepo.findById(employeeId).orElseThrow(() -> new NotFound(employeeId + " Not Found"));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAll() {
        List<Employee> employees = employeeRepo.findAll();
        return employees.stream().map((e) -> EmployeeMapper.mapToEmployeeDto(e)).collect(Collectors.toList());
    }
}
