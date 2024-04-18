package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Calculator c1 = new Calculator();
      Calculator.expParser = new ExpressionParser(3);
      try {
    	  Calculator.evaluate("x + y");
      } catch (MissingOperandException e) {
    	  e.getOperator();
    	  e.printStackTrace();
      }
      
      Calculator.expParser.addVariable("$", "x");
      Calculator.expParser.addVariable("x", "3");
      Calculator.expParser.parseVariables("x");
      Calculator.expParser.addVariable("x", "2");
      Calculator.expParser.evaluate("y = 1");
      try {
    	  Calculator.expParser.evaluate("y = 1.x");
      } catch (Exception e) {
    	  e.printStackTrace();
      }
  }
}
