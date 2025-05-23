package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Advisor {

    @Id
    @GeneratedValue()
    private long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;
    @OneToMany(mappedBy = "advisor")
    private List<Client> clients;





    protected Advisor() {

    }

    public Advisor(List<Client> clients, String email, String phone, String address, String lastName, String firstName, long advisorId) {
        this.clients = clients;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.lastName = lastName;
        this.firstName = firstName;
        this.advisorId = advisorId;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
