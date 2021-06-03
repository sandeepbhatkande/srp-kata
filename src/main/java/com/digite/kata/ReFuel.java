package com.digite.kata;

public class ReFuel {

    private static int remainingFuel;

    public static void reFuel(Vehicle a_Vehicle) {
        remainingFuel = a_Vehicle.getMaxFuel();
        a_Vehicle.setRemainingFuel(remainingFuel);
    }
    
}

