package entities;

import _abstract.Entity;

public class Game implements Entity {
    private String name;
    private int downloadCount;
    private double priceInDollars;

    public Game(String name, double priceInDollars) {
        this.name = name;
        this.priceInDollars = priceInDollars;
        downloadCount = 0;
    }
    public Game(){};

     public void setDownloadCount(int count){
        this.downloadCount = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){this.name = name;}

    public double getPriceInDollars() {
        return priceInDollars;
    }

    public void setPriceInDollars(double priceInDollars) {
        this.priceInDollars = priceInDollars;
    }

    public int getDownloadCount(){return this.downloadCount;}

    public void download(){
         setDownloadCount(getDownloadCount()+1);
    }
    @Override
    public String toString(){return name;}
}
