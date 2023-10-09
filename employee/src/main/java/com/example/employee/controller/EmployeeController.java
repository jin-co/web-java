package com.example.employee.controller;

import com.example.employee.common.NotFound;
import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
//@RestController
public class EmployeeController {
    //    private List<Employee> employeeList;
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/employees")
//    @GetMapping("/employees")
    public List<Employee> getEmployees() {
//        employeeList = Arrays.asList(
//                new Employee(1, "John", "Washington"),
//                new Employee(2, "Tom", "Waterloo")
//        );

        return employeeService.getEmployees();
    }

    @RequestMapping("/employees/{id}")
    //    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        //        error handling
        if (id < 0) {
            throw new NotFound("em not found: " + id);
        }

        return employeeService.getEmployee(id);
    }

    @RequestMapping(value = "/employees", method = RequestMethod.POST)
//    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @RequestMapping(value = "/employees/{id}", method = RequestMethod.PUT)
//    @PutMapping("/employees/{id}")
    public void updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
    }

    @RequestMapping(value = "/employees/{id}", method = RequestMethod.DELETE)
//    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }

//    @ExceptionHandler
//    public ResponseEntity<ErrorRes> handleError(NotFound ex) {
//        ErrorRes err = new ErrorRes();
//        err.setStatus(HttpStatus.NOT_FOUND.value());
//        err.setMessage(ex.getMessage());
//        err.setTimestamp(System.currentTimeMillis());
//        return new ResponseEntity<>(err, HttpStatus.NOT_FOUND);
//    }
//
//    @ExceptionHandler
//    public ResponseEntity<ErrorRes> handleException(Exception ex) {
//        ErrorRes err = new ErrorRes();
//        err.setStatus(HttpStatus.BAD_REQUEST.value());
//        err.setMessage(ex.getMessage());
//        err.setTimestamp(System.currentTimeMillis());
//        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
//    }
}
