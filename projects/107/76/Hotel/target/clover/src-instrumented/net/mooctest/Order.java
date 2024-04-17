/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Order {public static class __CLR4_4_15w5wluut6nyn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0031\u0030\u0037\u005c\u005c\u0037\u0036\u005c\u005c\u0048\u006f\u0074\u0065\u006c\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712813920933L,8589935092L,264,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static List<Order> orders = new ArrayList<>();





    private List<OrderItem> items;
    public Order(List<OrderItem> items){try{__CLR4_4_15w5wluut6nyn.R.inc(212);
        __CLR4_4_15w5wluut6nyn.R.inc(213);this.items = items;
    }finally{__CLR4_4_15w5wluut6nyn.R.flushNeeded();}}

    public void setItems(List<OrderItem> items){try{__CLR4_4_15w5wluut6nyn.R.inc(214);
        __CLR4_4_15w5wluut6nyn.R.inc(215);this.items = items;
    }finally{__CLR4_4_15w5wluut6nyn.R.flushNeeded();}}

    //////
    public double totalAmount(){try{__CLR4_4_15w5wluut6nyn.R.inc(216);
        __CLR4_4_15w5wluut6nyn.R.inc(217);double total = 0;
        __CLR4_4_15w5wluut6nyn.R.inc(218);for (OrderItem item:items)
            {__CLR4_4_15w5wluut6nyn.R.inc(219);total+=item.getAmount();
        }__CLR4_4_15w5wluut6nyn.R.inc(220);return total;
    }finally{__CLR4_4_15w5wluut6nyn.R.flushNeeded();}}

    //\u93c2\u677f\ue583\u7481\u3220\u5d1f
    public static void createOrder(List<OrderItem> orderItems){try{__CLR4_4_15w5wluut6nyn.R.inc(221);
        __CLR4_4_15w5wluut6nyn.R.inc(222);Order newOrder = new Order(orderItems);
        __CLR4_4_15w5wluut6nyn.R.inc(223);if ((((newOrder.totalAmount()>=500 && newOrder.totalAmount()<1000)&&(__CLR4_4_15w5wluut6nyn.R.iget(224)!=0|true))||(__CLR4_4_15w5wluut6nyn.R.iget(225)==0&false))){{
            __CLR4_4_15w5wluut6nyn.R.inc(226);orderItems.stream().forEach(orderItem -> {
                __CLR4_4_15w5wluut6nyn.R.inc(227);orderItem.setPaymentPrice(orderItem.getPaymentPrice()*0.9);
            });
        }}else {__CLR4_4_15w5wluut6nyn.R.inc(228);if ((((newOrder.totalAmount()>=1000)&&(__CLR4_4_15w5wluut6nyn.R.iget(229)!=0|true))||(__CLR4_4_15w5wluut6nyn.R.iget(230)==0&false))){{
            __CLR4_4_15w5wluut6nyn.R.inc(231);orderItems.stream().forEach(orderItem -> {
                __CLR4_4_15w5wluut6nyn.R.inc(232);orderItem.setPaymentPrice(orderItem.getPaymentPrice()*0.8);
            });
        }
        }}__CLR4_4_15w5wluut6nyn.R.inc(233);newOrder.setItems(orderItems);
        __CLR4_4_15w5wluut6nyn.R.inc(234);orders.add(newOrder);
    }finally{__CLR4_4_15w5wluut6nyn.R.flushNeeded();}}
    
    //\u93b5\u64b3\u5d43\u934f\u3129\u5134\u95bf\ufffd\u935e\ue1bf\ue187\u8930\ufffd
    public static void printOrders(){try{__CLR4_4_15w5wluut6nyn.R.inc(235);
        __CLR4_4_15w5wluut6nyn.R.inc(236);double allAmount = 0;
        __CLR4_4_15w5wluut6nyn.R.inc(237);for(int i = 0; (((i < orders.size())&&(__CLR4_4_15w5wluut6nyn.R.iget(238)!=0|true))||(__CLR4_4_15w5wluut6nyn.R.iget(239)==0&false)); i++){{
            __CLR4_4_15w5wluut6nyn.R.inc(240);Order order = orders.get(i);
            __CLR4_4_15w5wluut6nyn.R.inc(241);System.out.println("Order No."+(i+1));
            __CLR4_4_15w5wluut6nyn.R.inc(242);allAmount += order.totalAmount();
            __CLR4_4_15w5wluut6nyn.R.inc(243);order.printOrderDetails();
            __CLR4_4_15w5wluut6nyn.R.inc(244);System.out.println();
        }
        }__CLR4_4_15w5wluut6nyn.R.inc(245);System.out.println("AllAmount: "+formatDouble(allAmount));
    }finally{__CLR4_4_15w5wluut6nyn.R.flushNeeded();}}

    //\u947e\u5cf0\u5f47\u95b2\u6226\ue582\u93c8\ufffd\u6fb6\u0445\u6b91\u7481\u3220\u5d1f
    public static Order searchMaxOrder(){try{__CLR4_4_15w5wluut6nyn.R.inc(246);
        __CLR4_4_15w5wluut6nyn.R.inc(247);orders.sort((o1, o2) -> {
            __CLR4_4_15w5wluut6nyn.R.inc(248);if ((((o1.totalAmount()>o2.totalAmount())&&(__CLR4_4_15w5wluut6nyn.R.iget(249)!=0|true))||(__CLR4_4_15w5wluut6nyn.R.iget(250)==0&false)))
                {__CLR4_4_15w5wluut6nyn.R.inc(251);return -1;
            }else
                {__CLR4_4_15w5wluut6nyn.R.inc(252);return 1;
        }});
        __CLR4_4_15w5wluut6nyn.R.inc(253);return orders.get(0);
    }finally{__CLR4_4_15w5wluut6nyn.R.flushNeeded();}}

    /////
    public void printOrderDetails(){try{__CLR4_4_15w5wluut6nyn.R.inc(254);
        __CLR4_4_15w5wluut6nyn.R.inc(255);items.stream().forEach(orderItem -> {
            __CLR4_4_15w5wluut6nyn.R.inc(256);System.out.println(orderItem.PrintOrderItem());
        });
        __CLR4_4_15w5wluut6nyn.R.inc(257);System.out.println("Order Total:"+formatDouble(totalAmount()));
    }finally{__CLR4_4_15w5wluut6nyn.R.flushNeeded();}}

    ////////
    public static String formatDouble(double d) {try{__CLR4_4_15w5wluut6nyn.R.inc(258);
        __CLR4_4_15w5wluut6nyn.R.inc(259);DecimalFormat df = new DecimalFormat("#.00");
        __CLR4_4_15w5wluut6nyn.R.inc(260);df.setRoundingMode(RoundingMode.DOWN);
        __CLR4_4_15w5wluut6nyn.R.inc(261);return df.format(d);
    }finally{__CLR4_4_15w5wluut6nyn.R.flushNeeded();}}


    public List<OrderItem> getItems() {try{__CLR4_4_15w5wluut6nyn.R.inc(262);
        __CLR4_4_15w5wluut6nyn.R.inc(263);return items;
    }finally{__CLR4_4_15w5wluut6nyn.R.flushNeeded();}}
}
