package com.digite.kata;

public class Refill {
	private final int maxFuel;
    private int remainingFuel;

    public Refill(final int maxFuel, final int remainingFuel) {
        this.maxFuel = maxFuel;
        this.remainingFuel = remainingFuel;
    }

    public void reFuel(){
        remainingFuel = maxFuel;
    }
}
