/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inversiones;

/**
 *
 * @author jcarrero
 */
public class MutualFund extends ShareAsset {

    protected double totalShares;

    public MutualFund(double totalShares, String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice); // Invocacion del contructor del padre
        this.totalShares = totalShares;
    }
    
    @Override
    public double getMarketValue() {
       return this.totalShares*this.currentPrice;
    }

    @Override
    public double getProfit() {
        return (this.totalShares*this.currentPrice)-this.totalCost;
    }

    public double getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(double totalShares) {
        this.totalShares = totalShares;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    
    
    
}
