package com.wellsfargo.counselor.entity;


import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class PortfolioSecurityId {

    private Long portfolioId;
    private Long securityId;

    public PortfolioSecurityId() {}

    public PortfolioSecurityId(Long portfolioId, Long securityId) {
        this.portfolioId = portfolioId;
        this.securityId = securityId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PortfolioSecurityId that = (PortfolioSecurityId) o;
        return Objects.equals(portfolioId, that.portfolioId) && Objects.equals(securityId, that.securityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(portfolioId, securityId);
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
}
