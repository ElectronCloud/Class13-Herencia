/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inversiones;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jcarrero
 */
public class Company {
    private String name;
    private ArrayList<Asset> assets;
    private HashMap<Integer, Client> clients;

    public Company(String name) {
        this.name = name;
        this.assets = new ArrayList<>();
        this.clients = new HashMap<>();
    }
    
    public boolean addClient(int id, String name, String lastName, String email){

        Client client = new Client (id, name, lastName, email);
        this.clients.put(id, client);
        
        return true;       
    }
    
    public boolean addCash (double amount){
        
        Asset cash = new Cash (amount);
        
        return  this.assets.add(cash);
    }
    
    public boolean addStock(int totalShares, String symbol, double totalCost, double currentPrice){
        
        Asset stock = new Stock (totalShares, symbol, totalCost, currentPrice);
        return this.assets.add(stock);
    }
    
    public boolean addMutualFund (double totalShares, String symbol, double totalCost, double currentPrice){
        
        Asset mutualFund = new MutualFund (totalShares, symbol, totalCost, currentPrice);
        return this.assets.add(mutualFund);
    }
    
    public boolean addDividendStock (double dividens, int totalShares, String symbol, double totalCost, double currentPrice){
        
        Asset dividendStock = new DividenStock (dividens, totalShares, symbol, totalCost, currentPrice);
        return this.assets.add(dividendStock);
    }
    
    public double getAllMarketValue (){
        double marketValue=0;
        for (Client client : clients.values()){
            for (Asset asset : client.getAssets()){
                marketValue+=asset.getMarketValue();
            }
        }
        return marketValue;
    }
        
    public double getAllProfit(){
        double profit=0;
        for (Client client : clients.values()){
            for (Asset asset : client.getAssets()){
                profit+=asset.getProfit();
            }
        }
        return profit;
    }
    
    public HashMap<String, Double> getMarketValueByRange(){   //No entiendo la parte del rango de edades
        return null;
    }
    
    public Client getMaxProfit(){
        Client cliente=null;
        double profit=0;
        double x=0;
        for (Client client :clients.values()){
            for (Asset asset : client.getAssets()){
                profit+=asset.getProfit();
                if(profit>x){
                    x=profit;
                    cliente=client;
                }
            }
        }
        return cliente;
    }
    
    public HashMap<Client,Double> getClientWithMarketValue(){
        HashMap<Client, Double> clientes;
        clientes = new HashMap<>();
        double marketValue=0;
        for (Client client : clients.values()){
            for (Asset asset : client.getAssets()){
                marketValue+=asset.getMarketValue();
                clientes.put(client, marketValue);
            }
        }
        return clientes;
    }
}
