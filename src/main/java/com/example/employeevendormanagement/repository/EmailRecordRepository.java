package com.example.employeevendormanagement.repository;

import com.example.employeevendormanagement.model.EmailRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRecordRepository extends JpaRepository<EmailRecord, Long> {
}
