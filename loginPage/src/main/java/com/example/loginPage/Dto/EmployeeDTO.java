package com.example.loginPage.Dto;

import jakarta.persistence.Column;

public class EmployeeDTO {
    private int employeeid;

    private String employeename;
    // employee email
    private String email;
    // employeef password

    private String password;

    public EmployeeDTO(int employeeid, String employeename, String password, String email) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.password = password;
        this.email = email;
    }

    public EmployeeDTO() {
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "employeeid=" + employeeid +
                ", employeename='" + employeename + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
