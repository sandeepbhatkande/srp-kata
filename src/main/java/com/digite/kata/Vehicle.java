package com.digite.kata;

public class Vehicle {

    public final int maxFuel;
    public int remainingFuel;
    
   
    public Vehicle(int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(final int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }
    
    public void accelerate() {
		remainingFuel--;
    }
 
}
