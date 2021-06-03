package com.digite.kata;

public class Vehicle {
	
	public FuelTank fueltank;
	public Refill refill;

    public Vehicle(final int maxFuel) {
    	this.fueltank = new FuelTank(maxFuel);
    	this.refill = new Refill(maxFuel, this.fueltank.getRemainingFuel());
    }

    public void accelerate() {
    	fueltank.setRemainingFuel(fueltank.getRemainingFuel() - 1);
    }
    
    public void refuelVehicle() {
    	refill.reFuel();
    }
}
