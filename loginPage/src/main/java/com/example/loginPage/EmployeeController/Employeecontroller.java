package com.example.loginPage.EmployeeController;
//import com.example.loginPage.Dto.EmployeeDTO;
//import com.example.loginPage.Dto.LoginDTO;
import com.example.loginPage.service.EmployeeService;
//import com.example.loginPage.response.LoginResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import com.example.loginPage.Dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class Employeecontroller {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO)
    {
        String id = employeeService.addEmployee(employeeDTO);
        return id;
    }
//    @PostMapping(path = "/login")
//    public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO)
//    {
//        LoginResponse loginResponse = employeeService.loginEmployee(loginDTO);
//        return ResponseEntity.ok(loginResponse);
//    }

}
