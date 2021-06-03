package com.digite.kata;

public class Vehicle {
	
	public FuelTank w_fueltank;

    public Vehicle(final int maxFuel) {
    	this.w_fueltank = new FuelTank(maxFuel);
    }

    public FuelTank getFuelTank()
    {
    	return w_fueltank;
    }
    
    public void accelerate() {
    	w_fueltank.setRemainingFuel(w_fueltank.getRemainingFuel() - 1);
    }
}
