//package com.github.bsferreira.solid.srp.violation;
package com.digite.kata;

public class Vehicle extends Fuel{

    private final int maxFuel;
    private int remainingFuel;

    public Vehicle(int maxFuel) {
        super(maxFuel);
        this.maxFuel = maxFuel;
        this.remainingFuel = maxFuel;
    }

    public void accelerate() {
        remainingFuel--;
    }

    public static void main (String[] arg)
    {
        Vehicle v = new Vehicle(100);
        System.out.println ("remainingFuel: Before: " + v.remainingFuel);
    	v.accelerate();
        System.out.println("remainingFuel: After: " + v.remainingFuel);
    }
}