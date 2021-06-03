import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.digite.kata.Vehicle;

public class JTestVehicle {
	
	@Test
	public void testgetMaxFuel() {
		
		Vehicle w_Vehicle = new Vehicle(10);
		
		assertEquals(10, w_Vehicle.getMaxFuel());
		
	}
	
	@Test
	public void testGetRemainingFuel() {
		
		Vehicle w_Vehicle = new Vehicle(10);
		assertEquals(10, w_Vehicle.getRemainingFuel());
		
	}
	
	@Test
	public void testSetRemainingFuel() {
		
		Vehicle w_Vehicle = new Vehicle(10);
		w_Vehicle.setRemainingFuel(5);
		assertEquals(5, w_Vehicle.getRemainingFuel());
		
	}
	
	@Test
	public void testAccelerate() {
		
		Vehicle w_Vehicle = new Vehicle(10);
		w_Vehicle.accelerate();
		assertEquals(10, w_Vehicle.getRemainingFuel());
	}

}
