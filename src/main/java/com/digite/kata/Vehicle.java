//package com.github.bsferreira.solid.srp.violation;
package com.digite.kata;

public class Vehicle {
	
	public PetrolPump w_PetrolPump;
	private final int maxFuel;
	private int remainingFuel;
	
    public Vehicle(final int maxFuel) {
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
    	System.out.println("w_vehicle.remainingFuel: " +remainingFuel);
    }
}