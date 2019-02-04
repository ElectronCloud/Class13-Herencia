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
public class DividenStock extends Stock {
    private double dividens;

    public DividenStock(double dividens, int totalShares, String symbol, double totalCost, double currentPrice) {
        super(totalShares, symbol, totalCost, currentPrice); // Invocacion del contructor del padre
        this.dividens = dividens;
    }
    
    @Override
    public double getMarketValue() {
        return (this.totalShares*this.currentPrice)+this.dividens;
    }

    public double getDividens() {
        return dividens;
    }

    public void setDividens(double dividens) {
        this.dividens = dividens;
    }

    public int getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(int totalShares) {
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
