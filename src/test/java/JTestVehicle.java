import static org.junit.Assert.*;
import org.junit.Test;
import com.digite.kata.PetrolPump;
import com.digite.kata.Vehicle;

public class JTestVehicle {
	
	@Test
	public void test(){
		
		Vehicle w_Vehicle = new Vehicle(10);
    	while(w_Vehicle.getRemainingFuel() > 0)
    	{
    		w_Vehicle.accelerate();
    	}
    	assertEquals(w_Vehicle.getRemainingFuel(), 0);
    	
    	if(w_Vehicle.getRemainingFuel() == 0)
    	{
    		PetrolPump w_PetrolPump = new PetrolPump();
    		w_PetrolPump.reFuel(w_Vehicle);
    	}
    	assertEquals(w_Vehicle.getRemainingFuel(), 10);
	}
}
