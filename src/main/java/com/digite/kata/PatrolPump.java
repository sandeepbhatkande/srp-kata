package com.digite.kata;

public class PatrolPump {

    private final int maxFuel;
    private int remainingFuel;

    public PatrolPump(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    public void reFuel(){
        remainingFuel = maxFuel;
    }
}
