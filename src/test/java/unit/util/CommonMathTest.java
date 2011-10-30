package unit.util;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;

import util.CommonMath;

public class CommonMathTest {
	@Test
	public void testTheTruth() {
		Assert.assertTrue(true, "sanity test");
	}
	
  @Test
  public void testFactorialNegative() {
	  Assert.assertEquals(CommonMath.factorial(-5), -1, "factorial -5 is -1");
  }
  
  @Test
  public void testFactorialZero() {
	  Assert.assertEquals(CommonMath.factorial(0), 1, "factorial 0 is 1");
  }  
  
  @Test
  public void testFactorialFive() {
	  Assert.assertEquals(CommonMath.factorial(5), 120, "factorial 5 is 120");
  }   
}
