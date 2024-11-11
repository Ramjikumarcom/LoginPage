package com.example.loginPage.Repo;


import com.example.loginPage.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>
{
//    Optional<Employee> findOneByEmailAndPassword(String email, String password);
//    Employee findByEmail(String email);
}