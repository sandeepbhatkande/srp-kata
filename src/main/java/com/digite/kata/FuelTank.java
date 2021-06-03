package com.digite.kata;

public class FuelTank {
	 
	private int maxFuel;
	private int remainingFuel;
	
	public FuelTank(int maxFuel) {
		this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
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

    public void setRemainingFuel(final int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }
}
