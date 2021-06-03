
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.digite.kata.Vehicle;
import com.digite.kata.VehicleFueling;


public class JTestVehicle {

	@Test
	public void testMain()
	{
		Vehicle v = new Vehicle(20);
    	while (v.getRemainingFuel() > 0) 
    	{
    		v.accelerate();
    	}
    	
    	assertEquals(0, v.getRemainingFuel()); 
    	
    	if (v.getRemainingFuel() == 0) 
    	{
	    	VehicleFueling vv = new VehicleFueling();
	    	vv.reFuel(v);
    	}
    	assertEquals(20, v.getRemainingFuel()); 
	}
}
