
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.digite.kata.PetrolPump;
import com.digite.kata.Vehicle;


public class JTestVehicle {

	@Test
	public void testMain()
	{
		Vehicle v = new Vehicle(20);
    	while (v.remainingFuel > 0) {
    		v.accelerate();
    	}
    	
    	assertEquals(0, v.remainingFuel); 
    	
    	if (v.remainingFuel == 0) 
    	{
	    	PetrolPump pp = new PetrolPump();
	    	pp.reFuel(v);
    	}
    	assertEquals(20, v.remainingFuel); 
	}
}
