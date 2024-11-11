package com.example.loginPage.Entity;
import jakarta.persistence.*;

//import javax.persistf
@Entity
@Table(name="employee")
public class Employee {
    // employee id
    @Id
    @Column(name = "employee_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO.AUTO)
    private int employeeid;
    // empluyeee namef
    @Column(name = "employee_name", length = 255)
    private String employeename;
    // employee email
    @Column(name = "email", length = 255)
    private String email;
    // employeef password
    @Column(name = "password", length = 255)
    private String password;

    public Employee() {
    }
// constructor
    public Employee(int employeeid, String employeename, String email, String password) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.email = email;
        this.password = password;
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
        return "Employee{" +
                "employeeid=" + employeeid +
                ", employeename='" + employeename + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
//create getters and setters