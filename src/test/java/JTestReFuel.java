import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.digite.kata.ReFuel;
import com.digite.kata.Vehicle;


public class JTestReFuel {
	
	@Test
	public void testReFuel() {
		Vehicle w_Vehicle = new Vehicle(10);
		ReFuel.reFuel(w_Vehicle);
		assertEquals(10, w_Vehicle.getRemainingFuel());
	}
	
}
