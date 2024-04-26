package sdettestngassignment;

//CalculatorTest.java
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
 
 @Test(priority = 1)
 public void testAddition() {
     Calculator calculator = new Calculator();
     Assert.assertEquals(calculator.add(3, 2), 5);
 }
 
 @Test(priority = 2)
 public void testSubtraction() {
     Calculator calculator = new Calculator();
     Assert.assertEquals(calculator.subtract(3, 2), 1);
 }
 
 @Test(priority = 3)
 public void testMultiplication() {
     Calculator calculator = new Calculator();
     Assert.assertEquals(calculator.multiply(3, 2), 6);
 }
 
 @Test(priority = 4)
 public void testDivision() {
     Calculator calculator = new Calculator();
     Assert.assertEquals(calculator.divide(6, 2), 3);
 }
}
