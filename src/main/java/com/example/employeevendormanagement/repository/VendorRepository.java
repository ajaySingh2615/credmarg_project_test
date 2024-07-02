package com.example.employeevendormanagement.repository;

import com.example.employeevendormanagement.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
