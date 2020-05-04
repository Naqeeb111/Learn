package testNGExercise;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest {
	
	@Test
	public void m1()
	{
		System.out.println("Test");
	}
	
	@BeforeMethod
	public void m2()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void m3()
	{
		System.out.println("After Method");
	}

}
