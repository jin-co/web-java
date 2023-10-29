package com.example.employeecrudthymeleaf.controller;

import com.example.employeecrudthymeleaf.entity.Employee;
import com.example.employeecrudthymeleaf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String getAll(Model model) {
        List<Employee> employees = employeeService.getAll();
        model.addAttribute("employees", employees);
        return "employee/employee-list";
    }

    @GetMapping("/addForm")
    public String addOne(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee/add-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("employee") Employee employee) {
        System.out.println(employee.getEmail());
        employeeService.addEmployee(employee);
        return "redirect:/employees/list";
    }

    @GetMapping("/updateForm")
    public String updateForm(@RequestParam("id") int id, Model model) {
        Employee employee = employeeService.getOne(id);
        model.addAttribute("employee", employee);
        return "employee/add-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id, Model model) {
        employeeService.deleteEmployee(id);
        return "redirect:/employees/list";
    }
}
