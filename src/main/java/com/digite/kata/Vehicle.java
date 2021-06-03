package com.digite.kata;

public class Vehicle {

	private final int maxFuel;
	private int remainingFuel;
	public FuelCenter w_fuelCenter;
	
    public Vehicle(final int maxFuel) {
    	this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
        this.w_fuelCenter = new FuelCenter(maxFuel);
    }

    public void reFuel(){
        remainingFuel = maxFuel;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }
    
    public void accelerate()
    {
    	 remainingFuel--;
    }
    
    public FuelCenter getFuelCenter()
    {
    	return w_fuelCenter;
    }
    
    public void refuel() 
    {
    	w_fuelCenter.reFuel();
    }
}
