package junit;

import junit.framework.TestCase;

public class Part4UnitTest extends TestCase {

 protected void setUp() throws Exception {
     super.setUp();
 }

 protected void tearDown() throws Exception {
     super.tearDown();
 }
 
 //Exercise 5.12
 public void testConditionalOrOperator() {
     int a = 6543;
     int b = 67;
     boolean c = (b > a) || (b < a);
     assertEquals(true, b);
 }    
 
 //Exercise 5.21. 
 public void testLong() {
     long a = 56432852349l; 
     long b = 53274965978l;
     long c = a + b;
     assertEquals(109707818327l, c);
 }
}