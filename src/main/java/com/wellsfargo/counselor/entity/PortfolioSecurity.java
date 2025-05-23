package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@IdClass(PortfolioSecurityId.class)
public class PortfolioSecurity {


    @Id
    private Long portfolioId;

    @Id
    private Long securityId;

    @Column(nullable = false)
    private Integer quantity;
    @Column(nullable = false)
    private BigDecimal purchasePrice;

    @Column(nullable = false)
    private LocalDateTime purchaseDate;

    @ManyToOne
    @JoinColumn(name = "portfolioId", insertable = false, updatable = false)
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "securityId", insertable = false, updatable = false)
    private Security security;

    public PortfolioSecurity() {
    }

    public PortfolioSecurity(Long portfolioId, Long securityId, Integer quantity, BigDecimal purchasePrice, LocalDateTime purchaseDate, Portfolio portfolio, Security security) {
        this.portfolioId = portfolioId;
        this.securityId = securityId;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.portfolio = portfolio;
        this.security = security;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public void setSecurityId(Long securityId) {
        this.securityId = securityId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }
}
