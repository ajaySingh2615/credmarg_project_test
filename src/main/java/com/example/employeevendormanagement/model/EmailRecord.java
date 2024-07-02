package com.example.employeevendormanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class EmailRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String emailContent;
    private LocalDateTime sentAt;

    public EmailRecord(Long id, String emailContent, LocalDateTime sentAt) {
        this.id = id;
        this.emailContent = emailContent;
        this.sentAt = sentAt;
    }

    public EmailRecord() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }

    @Override
    public String toString() {
        return "EmailRecord{" +
                "id=" + id +
                ", emailContent='" + emailContent + '\'' +
                ", sentAt=" + sentAt +
                '}';
    }
}
