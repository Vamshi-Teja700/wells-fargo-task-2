package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue
    private int security_id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String category;

    public Security() {
    }

    public Security(int security_id, String name, String category) {
        this.security_id = security_id;
        this.name = name;
        this.category = category;
    }

    public int getSecurity_id() {
        return security_id;
    }

    public void setSecurity_id(int security_id) {
        this.security_id = security_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
