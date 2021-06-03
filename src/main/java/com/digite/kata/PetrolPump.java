package com.digite.kata;

public class PetrolPump {

	// public Vehicle Vehicle;
    public void reFuel( Vehicle w_vehicle)
    {    	
    	w_vehicle.setRemainingFuel(w_vehicle.getMaxFuel());
    	System.out.println("w_vehicle.remainingFuel: " +w_vehicle.getRemainingFuel());
    }
}
