package net.mooctest;

import org.junit.Test;

public class CalculatorTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
    	Calculator cac=new Calculator();
        Calculator.expParser = new ExpressionParser(3);
        try {
            Calculator.evaluate("x + y");
        } catch (MissingOperandException e) {
            e.getOperator();
            e.printStackTrace();
        }

        Calculator.expParser.addVariable("$","x");

        Calculator.expParser.addVariable("x", "3");
        Calculator.expParser.parseVariables("x");
        Calculator.expParser.addVariable("x", "2");
        Calculator.expParser.evaluate("y = 1");
        try {
            Calculator.expParser.evaluate("y = 1.x");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        Calculator.parseCommand("list funcs");
        Calculator.parseCommand("list vars");
        Calculator.parseCommand("list");
        Calculator.parseCommand("list cmds");
        Calculator.parseCommand("help cmds");
        Calculator.parseCommand("help funcs");
        Calculator.parseCommand("help vars");
        Calculator.parseCommand("help");
        Calculator.parseCommand("exit");
        try {
            Calculator.parseCommand("test");
        } catch (CommandNotFoundException e) {
            e.getCommand();
            e.printStackTrace();
        }
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        Calculator.evaluate("1^1");
        Calculator.evaluate("1%1");
        Calculator.evaluate("1/1");
        Calculator.evaluate("1*1.111");
        Calculator.evaluate("1+1");
        Calculator.evaluate("1-(1*1)");
        Calculator.evaluate("(1 - 2 + 3) - 5");

        Calculator.evaluate("sin[1]");
        Calculator.evaluate("cos[1]");
        Calculator.evaluate("tan[1]");
        Calculator.evaluate("csc[1]");
        Calculator.evaluate("sec[1]");
        Calculator.evaluate("ctn[1]");
        Calculator.evaluate("rad[1]");
        Calculator.evaluate("deg[1]");
        Calculator.evaluate("fct[1]");
        Calculator.evaluate("fct[11]");
        Calculator.evaluate("abs[1]");
        Calculator.evaluate("exp[1]");
        Calculator.evaluate("log[1]");

        Calculator.evaluate("-log[1]");
        try {
            Calculator.evaluate("test[1]");
        } catch (FunctionNotFoundException e) {
            e.getFunc();
            e.printStackTrace();
        }
        try {
            Calculator.evaluate("log[]");
        } catch (MissingOperandException e) {
            e.getFaultyExpression();
            e.printStackTrace();
        }
        try {
            Calculator.evaluate("log[");
        } catch (UnmatchedBracketsException e) {
            e.getFaultyExpression();
            e.printStackTrace();
        }
        try {
            Calculator.evaluate("log[(1+1]");
        } catch (UnmatchedBracketsException e) {
            e.getFaultyExpression();
            e.getIndexOfBracket();
            e.printStackTrace();
        }
        try {
            Calculator.evaluate("log[<a>]");
        } catch (VariableNotFoundException e) {
            e.getFaultyExpression();
            e.getVar();
            e.printStackTrace();
        }
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        try {
            Calculator.evaluate("");
        } catch (NullExpressionException e) {
            e.getFaultyExpression();
            e.printStackTrace();
        }
        try {
            Calculator.evaluate("(1+1");
        } catch (UnmatchedBracketsException e) {
            e.getFaultyExpression();
            e.getIndexOfBracket();
            e.printStackTrace();
        }
        try {
            Calculator.evaluate("<a>+<b>");
        } catch (VariableNotFoundException e) {
            e.getFaultyExpression();
            e.getVar();
            e.printStackTrace();
        }
        VariableNotFoundException e = new VariableNotFoundException("x");
    }
}