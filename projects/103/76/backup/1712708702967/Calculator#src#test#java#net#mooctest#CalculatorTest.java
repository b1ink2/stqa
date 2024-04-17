package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Calculator.parseCommand("list funcs");
      Calculator.parseCommand("help");
      Calculator.parseCommand("exit");
  }
}
