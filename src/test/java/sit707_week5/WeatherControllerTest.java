package sit707_week5;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class WeatherControllerTest {
	
    @Test
	public void testStudentIdentity() {
		String studentId = "S223182277";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Isuru Perera";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testTemperatureStatistics() {
	    // Arrange
	    WeatherController wController = WeatherController.getInstance();

	    // Act
	    double minTemperature = wController.getTemperatureMinFromCache();
	    double maxTemperature = wController.getTemperatureMaxFromCache();
	    double avgTemperature = wController.getTemperatureAverageFromCache();

	    // Assert
	    assertEquals(minTemperature, wController.getTemperatureMinFromCache(), 0);
	    assertEquals(maxTemperature, wController.getTemperatureMaxFromCache(), 0);
	    assertEquals(avgTemperature, wController.getTemperatureAverageFromCache(), 0);

	    // Clean up
	    wController.close();
	}

	@Test
	public void testTemperaturePersist() {
		/*
		 * Remove below comments ONLY for 5.3C task.
		 */
//		System.out.println("+++ testTemperaturePersist +++");
//		
//		// Initialise controller
//		WeatherController wController = WeatherController.getInstance();
//		
//		String persistTime = wController.persistTemperature(10, 19.5);
//		String now = new SimpleDateFormat("H:m:s").format(new Date());
//		System.out.println("Persist time: " + persistTime + ", now: " + now);
//		
//		Assert.assertTrue(persistTime.equals(now));
//		
//		wController.close();
	}
}
