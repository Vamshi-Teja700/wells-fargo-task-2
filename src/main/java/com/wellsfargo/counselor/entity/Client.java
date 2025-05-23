package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;



    @Entity
    public class Client {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long clientId;
        @Column(nullable = false)
        private String name;
        @Column(nullable = false)
        private String email;
        @Column(nullable = false)
        private String phone;
        @Column(nullable = false)
        private String address;
        @Enumerated(EnumType.STRING)
        private RiskProfile riskProfile;
        @Column(nullable = false)
        private LocalDateTime createdAt;

        @ManyToOne
        @JoinColumn(name = "advisor_id")
        private Advisor advisor;

        @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
        private Portfolio portfolio;

        public enum RiskProfile {
            LOW_RISK, MEDIUM_RISK, HIGH_RISK
        }

        public Client() {
        }

        public Client(Long clientId, String name, String email, String phone, RiskProfile riskProfile, String address, LocalDateTime createdAt, Advisor advisor, Portfolio portfolio) {
            this.clientId = clientId;
            this.name = name;
            this.email = email;
            this.phone = phone;
            this.riskProfile = riskProfile;
            this.address = address;
            this.createdAt = createdAt;
            this.advisor = advisor;
            this.portfolio = portfolio;
        }

        public Long getClientId() {
            return clientId;
        }

        public void setClientId(Long clientId) {
            this.clientId = clientId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public RiskProfile getRiskProfile() {
            return riskProfile;
        }

        public void setRiskProfile(RiskProfile riskProfile) {
            this.riskProfile = riskProfile;
        }

        public LocalDateTime getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
        }

        public Advisor getAdvisor() {
            return advisor;
        }

        public void setAdvisor(Advisor advisor) {
            this.advisor = advisor;
        }

        public Portfolio getPortfolio() {
            return portfolio;
        }

        public void setPortfolio(Portfolio portfolio) {
            this.portfolio = portfolio;
        }
    }
