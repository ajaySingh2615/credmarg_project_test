package com.example.employeevendormanagement.controller;

import com.example.employeevendormanagement.model.Employee;
import com.example.employeevendormanagement.model.Vendor;
import com.example.employeevendormanagement.model.EmailRecord;
import com.example.employeevendormanagement.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return adminService.createEmployee(employee);
    }

    @PostMapping("/vendor")
    public Vendor createVendor(@RequestBody Vendor vendor) {
        return adminService.createVendor(vendor);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return adminService.getAllEmployees();
    }

    @GetMapping("/vendors")
    public List<Vendor> getAllVendors() {
        return adminService.getAllVendors();
    }

    @PostMapping("/send-emails")
    public void sendEmailsToVendors(@RequestBody List<Vendor> vendors) {
        adminService.sendEmailToVendors(vendors);
    }

    @GetMapping("/sent-emails")
    public List<EmailRecord> getAllSentEmails() {
        return adminService.getAllSentEmails();
    }
}
