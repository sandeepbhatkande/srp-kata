package com.digite.kata;

public class FuelCenter {

	private final int maxFuel;
    private int remainingFuel;

    public FuelCenter(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    public void reFuel(){
        remainingFuel = maxFuel;
    }

}
