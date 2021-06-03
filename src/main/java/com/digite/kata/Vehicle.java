package com.digite.kata;

public class Vehicle {
	
	public FuelTank w_fueltank;
	public PatrolPump w_patrolPump;

    public Vehicle(final int maxFuel) {
    	this.w_fueltank = new FuelTank(maxFuel);
    	this.w_patrolPump = new PatrolPump(maxFuel);
    }

    public FuelTank getFuelTank()
    {
    	return w_fueltank;
    }
    
    public PatrolPump getPatrolPump()
    {
    	return w_patrolPump;
    }
    
    public void accelerate() {
    	w_fueltank.setRemainingFuel(w_fueltank.getRemainingFuel() - 1);
    }
    
    public void refuelVehicle() {
    	w_patrolPump.reFuel();
    }
    
    
}
