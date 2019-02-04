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
public class Client {
    private int id;
    private String name;
    private String lastName;
    private String email;
    private Asset[] assets;

    public Client(int id, String name, String lastName, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.assets = new Asset [10];
    }
    
    public boolean addAsset(Asset asset){
        for(int i=0; i<this.assets.length; i++){
        if(this.assets[i]==null){
            return true;
        }
            }
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Asset[] getAssets() {
        return assets;
    }

    public void setAssets(Asset[] assets) {
        this.assets = assets;
    }
    
    
}
