package com.example.employeevendormanagement.service;

import com.example.employeevendormanagement.model.Employee;
import com.example.employeevendormanagement.model.Vendor;
import com.example.employeevendormanagement.model.EmailRecord;
import com.example.employeevendormanagement.repository.EmployeeRepository;
import com.example.employeevendormanagement.repository.VendorRepository;
import com.example.employeevendormanagement.repository.EmailRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AdminService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private VendorRepository vendorRepository;

    @Autowired
    private EmailRecordRepository emailRecordRepository;

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Vendor createVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }

    public void sendEmailToVendors(List<Vendor> vendors) {
        for (Vendor vendor : vendors) {
            String emailContent = "Sending payments to vendor " + vendor.getName() + " at upi " + vendor.getUpi();
            System.out.println(emailContent);
            EmailRecord emailRecord = new EmailRecord();
            emailRecord.setEmailContent(emailContent);
            emailRecord.setSentAt(LocalDateTime.now());
            emailRecordRepository.save(emailRecord);
        }
    }

    public List<EmailRecord> getAllSentEmails() {
        return emailRecordRepository.findAll();
    }
}
