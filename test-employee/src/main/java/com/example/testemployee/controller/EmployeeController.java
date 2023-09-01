package com.example.testemployee.controller;

import com.example.testemployee.entity.Employee;
import com.example.testemployee.service.EmployeeService;
import com.example.testemployee.service.EmployeeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
@ResponseBody
public class EmployeeController {
    EmployeeService employeeService = new EmployeeServiceImpl();

    @GetMapping("")
    public List<Employee> getEmployee() {
        return employeeService.getEmployees();
    }

    @RequestMapping("/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
        employeeService.updateEmployee(employee);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }
}
