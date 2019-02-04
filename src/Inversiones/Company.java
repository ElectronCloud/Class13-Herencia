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
    
    // añadir metodo que reciba como parametro un activo y el cliente
    
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
        return 0;
    }
    
    public HashMap<String, Double> getMarketValueByRange(){
        return null;
    }
    
    public Client getMaxProfit(){
        return null;
    }
    
    public HashMap<Client,Double> getClientWithMarketValue(){
        return null;
    }
}
