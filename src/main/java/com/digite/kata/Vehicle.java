package com.github.bsferreira.solid.srp.violation;
package com.digite.kata

public class Vehicle {

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
}

public class Journey {

	Vehicle myVehicle = new Vehicle(100);

    public void reFuel(){
    	myVehicle.setRemainingFuel(myVehicle.getMaxFuel());
    }

    public void accelerate() {
    	myVehicle.setRemainingFuel(myVehicle.getRemainingFuel()-1);
    }
}
