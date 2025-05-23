package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private  long portfolio_id;
    @OneToOne
    @JoinColumn(name = "client_id", unique = true)
    private Client client;
    @Column(nullable = false)
    private PortfolioStatus status;
    @Column(nullable = false)
    private LocalDate created_at;
    @Column(nullable = false)
    private LocalDate updated_at;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
    private List<PortfolioSecurity> holdings;



    public enum PortfolioStatus {
        ACTIVE, ARCHIVED
    }
    public Portfolio() {
    }

    public Portfolio(long portfolio_id, Client client, PortfolioStatus status, LocalDate created_at, LocalDate updated_at) {
        this.portfolio_id = portfolio_id;
        this.client = client;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public long getPortfolio_id() {
        return portfolio_id;
    }

    public void setPortfolio_id(long portfolio_id) {
        this.portfolio_id = portfolio_id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    public LocalDate getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDate updated_at) {
        this.updated_at = updated_at;
    }

    public PortfolioStatus getStatus() {
        return status;
    }

    public void setStatus(PortfolioStatus status) {
        this.status = status;
    }
}
