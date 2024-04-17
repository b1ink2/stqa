package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Calculator.parseCommand("list funcs");
      Calculator.parseCommand("help");
      Calculator.parseCommand("exit");
      Calculator.parseCommand("help vars");
      Calculator.parseCommand("help funcs");
      Calculator.parseCommand("help cmds");
      Calculator.parseCommand(list );
  }
}
