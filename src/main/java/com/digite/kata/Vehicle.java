package com.digite.kata;

public class Vehicle {

    private final int maxFuel;
    private int remainingFuel;
    
   
    public Vehicle(int maxFuel) {
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
    }
    
    public static void main(String args[])
    {
    	Vehicle v = new Vehicle(20);
    	
    	while (v.remainingFuel > 0) {
    		v.accelerate();
    		//System.out.println(v.remainingFuel);
    	}
    		
    	if (v.remainingFuel == 0) 
    	{
	    	PetrolPump pp = new PetrolPump();
	    	pp.reFuel(v);
    	}
    	System.out.print(v.remainingFuel);
    	
    }

}
