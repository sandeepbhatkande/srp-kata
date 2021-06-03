//package com.github.bsferreira.solid.srp.violation;
package com.digite.kata;

public class Vehicle {

    private FuelTank fuelTank;

    public Vehicle(int maxFuel) {
    	fuelTank = new FuelTank(maxFuel);
    }

    public FuelTank getFuelTank() {
    	return fuelTank;
    }

    public void accelerate() {
    	fuelTank.setRemainingFuel(fuelTank.getRemainingFuel()-1);
    }
}
