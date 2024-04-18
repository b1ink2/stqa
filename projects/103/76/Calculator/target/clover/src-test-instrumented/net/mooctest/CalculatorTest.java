/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import org.junit.Test;

public class CalculatorTest {static class __CLR4_4_1bhbhlut5a7vy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0031\u0030\u0033\u005c\u005c\u0037\u0036\u005c\u005c\u0043\u0061\u006c\u0063\u0075\u006c\u0061\u0074\u006f\u0072\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712713310049L,8589935092L,477,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test(timeout = 4000)
    public void test00() throws Throwable {__CLR4_4_1bhbhlut5a7vy.R.globalSliceStart(getClass().getName(),413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pt4bdbh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bhbhlut5a7vy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bhbhlut5a7vy.R.globalSliceEnd(getClass().getName(),"net.mooctest.CalculatorTest.test00",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pt4bdbh() throws Throwable{try{__CLR4_4_1bhbhlut5a7vy.R.inc(413);
    	__CLR4_4_1bhbhlut5a7vy.R.inc(414);Calculator cac=new Calculator();
        __CLR4_4_1bhbhlut5a7vy.R.inc(415);Calculator.expParser = new ExpressionParser(3);
        __CLR4_4_1bhbhlut5a7vy.R.inc(416);try {
            __CLR4_4_1bhbhlut5a7vy.R.inc(417);Calculator.evaluate("x + y");
        } catch (MissingOperandException e) {
//            e.getOperator();
//            e.printStackTrace();
        }

        __CLR4_4_1bhbhlut5a7vy.R.inc(418);Calculator.expParser.addVariable("$","x");

        __CLR4_4_1bhbhlut5a7vy.R.inc(419);Calculator.expParser.addVariable("x", "3");
        __CLR4_4_1bhbhlut5a7vy.R.inc(420);Calculator.expParser.parseVariables("x");
        __CLR4_4_1bhbhlut5a7vy.R.inc(421);Calculator.expParser.addVariable("x", "2");
        __CLR4_4_1bhbhlut5a7vy.R.inc(422);Calculator.expParser.evaluate("y = 1");
        __CLR4_4_1bhbhlut5a7vy.R.inc(423);try {
            __CLR4_4_1bhbhlut5a7vy.R.inc(424);Calculator.expParser.evaluate("y = 1.x");
        }catch (Exception e){
//            e.printStackTrace();
        }
    }finally{__CLR4_4_1bhbhlut5a7vy.R.flushNeeded();}}

    @Test(timeout = 4000)
    public void test01() throws Throwable {__CLR4_4_1bhbhlut5a7vy.R.globalSliceStart(getClass().getName(),425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yt33ubt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bhbhlut5a7vy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bhbhlut5a7vy.R.globalSliceEnd(getClass().getName(),"net.mooctest.CalculatorTest.test01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yt33ubt() throws Throwable{try{__CLR4_4_1bhbhlut5a7vy.R.inc(425);
        __CLR4_4_1bhbhlut5a7vy.R.inc(426);Calculator.parseCommand("list funcs");
        __CLR4_4_1bhbhlut5a7vy.R.inc(427);Calculator.parseCommand("list vars");
        __CLR4_4_1bhbhlut5a7vy.R.inc(428);Calculator.parseCommand("list");
        __CLR4_4_1bhbhlut5a7vy.R.inc(429);Calculator.parseCommand("list cmds");
        __CLR4_4_1bhbhlut5a7vy.R.inc(430);Calculator.parseCommand("help cmds");
        __CLR4_4_1bhbhlut5a7vy.R.inc(431);Calculator.parseCommand("help funcs");
        __CLR4_4_1bhbhlut5a7vy.R.inc(432);Calculator.parseCommand("help vars");
        __CLR4_4_1bhbhlut5a7vy.R.inc(433);Calculator.parseCommand("help");
        __CLR4_4_1bhbhlut5a7vy.R.inc(434);Calculator.parseCommand("exit");
        __CLR4_4_1bhbhlut5a7vy.R.inc(435);try {
            __CLR4_4_1bhbhlut5a7vy.R.inc(436);Calculator.parseCommand("test");
        } catch (CommandNotFoundException e) {
//            e.getCommand();
//            e.printStackTrace();
        }
    }finally{__CLR4_4_1bhbhlut5a7vy.R.flushNeeded();}}

    @Test(timeout = 4000)
    public void test02() throws Throwable {__CLR4_4_1bhbhlut5a7vy.R.globalSliceStart(getClass().getName(),437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_177t1wbc5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bhbhlut5a7vy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bhbhlut5a7vy.R.globalSliceEnd(getClass().getName(),"net.mooctest.CalculatorTest.test02",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_177t1wbc5() throws Throwable{try{__CLR4_4_1bhbhlut5a7vy.R.inc(437);
        __CLR4_4_1bhbhlut5a7vy.R.inc(438);Calculator.evaluate("1^1");
        __CLR4_4_1bhbhlut5a7vy.R.inc(439);Calculator.evaluate("1%1");
        __CLR4_4_1bhbhlut5a7vy.R.inc(440);Calculator.evaluate("1/1");
        __CLR4_4_1bhbhlut5a7vy.R.inc(441);Calculator.evaluate("1*1.111");
        __CLR4_4_1bhbhlut5a7vy.R.inc(442);Calculator.evaluate("1+1");
        __CLR4_4_1bhbhlut5a7vy.R.inc(443);Calculator.evaluate("1-(1*1)");
        __CLR4_4_1bhbhlut5a7vy.R.inc(444);Calculator.evaluate("(1 - 2 + 3) - 5");

        __CLR4_4_1bhbhlut5a7vy.R.inc(445);Calculator.evaluate("sin[1]");
        __CLR4_4_1bhbhlut5a7vy.R.inc(446);Calculator.evaluate("cos[1]");
        __CLR4_4_1bhbhlut5a7vy.R.inc(447);Calculator.evaluate("tan[1]");
        __CLR4_4_1bhbhlut5a7vy.R.inc(448);Calculator.evaluate("csc[1]");
        __CLR4_4_1bhbhlut5a7vy.R.inc(449);Calculator.evaluate("sec[1]");
        __CLR4_4_1bhbhlut5a7vy.R.inc(450);Calculator.evaluate("ctn[1]");
        __CLR4_4_1bhbhlut5a7vy.R.inc(451);Calculator.evaluate("rad[1]");
        __CLR4_4_1bhbhlut5a7vy.R.inc(452);Calculator.evaluate("deg[1]");
        __CLR4_4_1bhbhlut5a7vy.R.inc(453);Calculator.evaluate("fct[1]");
        __CLR4_4_1bhbhlut5a7vy.R.inc(454);Calculator.evaluate("fct[11]");
        __CLR4_4_1bhbhlut5a7vy.R.inc(455);Calculator.evaluate("abs[1]");
        __CLR4_4_1bhbhlut5a7vy.R.inc(456);Calculator.evaluate("exp[1]");
        __CLR4_4_1bhbhlut5a7vy.R.inc(457);Calculator.evaluate("log[1]");

        __CLR4_4_1bhbhlut5a7vy.R.inc(458);Calculator.evaluate("-log[1]");
        __CLR4_4_1bhbhlut5a7vy.R.inc(459);try {
            __CLR4_4_1bhbhlut5a7vy.R.inc(460);Calculator.evaluate("test[1]");
        } catch (FunctionNotFoundException e) {
//            e.getFunc();
//            e.printStackTrace();
        }
        __CLR4_4_1bhbhlut5a7vy.R.inc(461);try {
            __CLR4_4_1bhbhlut5a7vy.R.inc(462);Calculator.evaluate("log[]");
        } catch (MissingOperandException e) {
//            e.getFaultyExpression();
//            e.printStackTrace();
        }
        __CLR4_4_1bhbhlut5a7vy.R.inc(463);try {
            __CLR4_4_1bhbhlut5a7vy.R.inc(464);Calculator.evaluate("log[");
        } catch (UnmatchedBracketsException e) {
//            e.getFaultyExpression();
//            e.printStackTrace();
        }
        __CLR4_4_1bhbhlut5a7vy.R.inc(465);try {
            __CLR4_4_1bhbhlut5a7vy.R.inc(466);Calculator.evaluate("log[(1+1]");
        } catch (UnmatchedBracketsException e) {
//            e.getFaultyExpression();
//            e.getIndexOfBracket();
//            e.printStackTrace();
        }
        __CLR4_4_1bhbhlut5a7vy.R.inc(467);try {
            __CLR4_4_1bhbhlut5a7vy.R.inc(468);Calculator.evaluate("log[<a>]");
        } catch (VariableNotFoundException e) {
//            e.getFaultyExpression();
//            e.getVar();
//            e.printStackTrace();
        }
    }finally{__CLR4_4_1bhbhlut5a7vy.R.flushNeeded();}}

    @Test(timeout = 4000)
    public void test03() throws Throwable {__CLR4_4_1bhbhlut5a7vy.R.globalSliceStart(getClass().getName(),469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1agt0osd1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bhbhlut5a7vy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bhbhlut5a7vy.R.globalSliceEnd(getClass().getName(),"net.mooctest.CalculatorTest.test03",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1agt0osd1() throws Throwable{try{__CLR4_4_1bhbhlut5a7vy.R.inc(469);
        __CLR4_4_1bhbhlut5a7vy.R.inc(470);try {
            __CLR4_4_1bhbhlut5a7vy.R.inc(471);Calculator.evaluate("");
        } catch (NullExpressionException e) {
//            e.getFaultyExpression();
//            e.printStackTrace();
        }
        __CLR4_4_1bhbhlut5a7vy.R.inc(472);try {
            __CLR4_4_1bhbhlut5a7vy.R.inc(473);Calculator.evaluate("(1+1");
        } catch (UnmatchedBracketsException e) {
//            e.getFaultyExpression();
//            e.getIndexOfBracket();
//            e.printStackTrace();
        }
        __CLR4_4_1bhbhlut5a7vy.R.inc(474);try {
            __CLR4_4_1bhbhlut5a7vy.R.inc(475);Calculator.evaluate("<a>+<b>");
        } catch (VariableNotFoundException e) {
//            e.getFaultyExpression();
//            e.getVar();
//            e.printStackTrace();
        }
        __CLR4_4_1bhbhlut5a7vy.R.inc(476);VariableNotFoundException e = new VariableNotFoundException("x");
    }finally{__CLR4_4_1bhbhlut5a7vy.R.flushNeeded();}}
}