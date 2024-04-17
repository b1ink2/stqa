/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
/**
 * @Author: xuexb
 * @Date: 2019.7.17 13:19
 */
public class Product{public static class __CLR4_4_18080luut6nzh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0031\u0030\u0037\u005c\u005c\u0037\u0036\u005c\u005c\u0048\u006f\u0074\u0065\u006c\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712813920933L,8589935092L,345,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public double price;
    public double discount = 1;
    public String name;
    public int count; // \u93c1\u4f34\u567a

    public Product(String name, double price, int count){try{__CLR4_4_18080luut6nzh.R.inc(288);
        __CLR4_4_18080luut6nzh.R.inc(289);this.setName(name);
        __CLR4_4_18080luut6nzh.R.inc(290);this.setPrice(price);
        __CLR4_4_18080luut6nzh.R.inc(291);this.setCount(count);
    }finally{__CLR4_4_18080luut6nzh.R.flushNeeded();}}

    //\u947e\u5cf0\u5f47\u935f\u55d7\u6427\u935e\ue1bc\u5d20\u93c3\u8235\u6e36\u7f01\u581d\u757e\u6d60\ufffd
    public double getPaymentPrice(){try{__CLR4_4_18080luut6nzh.R.inc(292);
        __CLR4_4_18080luut6nzh.R.inc(293);return price * discount;
    }finally{__CLR4_4_18080luut6nzh.R.flushNeeded();}}

    //\u7481\u5267\u7586\u935f\u55d7\u6427\u6d60\u950b\u7278
    public void setPrice(double price){try{__CLR4_4_18080luut6nzh.R.inc(294);
        __CLR4_4_18080luut6nzh.R.inc(295);if((((price<=0)&&(__CLR4_4_18080luut6nzh.R.iget(296)!=0|true))||(__CLR4_4_18080luut6nzh.R.iget(297)==0&false)))
            {__CLR4_4_18080luut6nzh.R.inc(298);throw new IllegalArgumentException("Price cannot less than 0: "+price);
        }__CLR4_4_18080luut6nzh.R.inc(299);if(((((price+"").length()-(price+"").indexOf(".")-1 > 2)&&(__CLR4_4_18080luut6nzh.R.iget(300)!=0|true))||(__CLR4_4_18080luut6nzh.R.iget(301)==0&false))){{
            __CLR4_4_18080luut6nzh.R.inc(302);throw new IllegalArgumentException("Price's length is wrong: "+price);
        }
        }__CLR4_4_18080luut6nzh.R.inc(303);this.price = price;
    }finally{__CLR4_4_18080luut6nzh.R.flushNeeded();}}

    //\u7481\u5267\u7586\u935f\u55d7\u6427\u93b6\u6a3b\u58b8
    public void setDiscount(double discount){try{__CLR4_4_18080luut6nzh.R.inc(304);
        __CLR4_4_18080luut6nzh.R.inc(305);if((((discount<=0)&&(__CLR4_4_18080luut6nzh.R.iget(306)!=0|true))||(__CLR4_4_18080luut6nzh.R.iget(307)==0&false)))
            {__CLR4_4_18080luut6nzh.R.inc(308);throw new IllegalArgumentException("Discount cannot less than 0: "+discount);
        }__CLR4_4_18080luut6nzh.R.inc(309);if((((discount>1)&&(__CLR4_4_18080luut6nzh.R.iget(310)!=0|true))||(__CLR4_4_18080luut6nzh.R.iget(311)==0&false)))
        	{__CLR4_4_18080luut6nzh.R.inc(312);throw new IllegalArgumentException("Discount cannot larger than 1: "+discount);
        }__CLR4_4_18080luut6nzh.R.inc(313);if(((((discount+"").length()-(discount+"").indexOf(".")-1 > 2)&&(__CLR4_4_18080luut6nzh.R.iget(314)!=0|true))||(__CLR4_4_18080luut6nzh.R.iget(315)==0&false))){{
            __CLR4_4_18080luut6nzh.R.inc(316);throw new IllegalArgumentException("Discount's length is wrong: "+discount);
        }
        }__CLR4_4_18080luut6nzh.R.inc(317);this.discount = discount;
    }finally{__CLR4_4_18080luut6nzh.R.flushNeeded();}}

    //\u7481\u5267\u7586\u935f\u55d7\u6427\u935a\u5d87\u041e
    public void setName(String name){try{__CLR4_4_18080luut6nzh.R.inc(318);
        __CLR4_4_18080luut6nzh.R.inc(319);char [] data = name.toCharArray();
        __CLR4_4_18080luut6nzh.R.inc(320);for( char c: data){{
            __CLR4_4_18080luut6nzh.R.inc(321);if((((!(('a'<=c&&c<='z')||('A'<=c&&c<='Z')))&&(__CLR4_4_18080luut6nzh.R.iget(322)!=0|true))||(__CLR4_4_18080luut6nzh.R.iget(323)==0&false))){{
                __CLR4_4_18080luut6nzh.R.inc(324);throw new IllegalArgumentException("Please enter English characters: "+name);
            }
        }}
        }__CLR4_4_18080luut6nzh.R.inc(325);if ((((name.length()>20)&&(__CLR4_4_18080luut6nzh.R.iget(326)!=0|true))||(__CLR4_4_18080luut6nzh.R.iget(327)==0&false))){{
            __CLR4_4_18080luut6nzh.R.inc(328);throw new IllegalArgumentException("The length of product's name cannot longer than 20: "+name);
        }
        }__CLR4_4_18080luut6nzh.R.inc(329);this.name = name;
    }finally{__CLR4_4_18080luut6nzh.R.flushNeeded();}}

    //\u7481\u5267\u7586\u935f\u55d7\u6427\u93c1\u4f34\u567a
    public void setCount(int count){try{__CLR4_4_18080luut6nzh.R.inc(330);
        __CLR4_4_18080luut6nzh.R.inc(331);if ((((count<=0)&&(__CLR4_4_18080luut6nzh.R.iget(332)!=0|true))||(__CLR4_4_18080luut6nzh.R.iget(333)==0&false))){{
            __CLR4_4_18080luut6nzh.R.inc(334);throw new IllegalArgumentException("Quantity should larger than 0: "+count);
        }
        }__CLR4_4_18080luut6nzh.R.inc(335);this.count = count;
    }finally{__CLR4_4_18080luut6nzh.R.flushNeeded();}}

    //\u947e\u5cf0\u5f47\u935f\u55d7\u6427\u6dc7\u2103\u4f05
    public String getInfo(){try{__CLR4_4_18080luut6nzh.R.inc(336);
        __CLR4_4_18080luut6nzh.R.inc(337);String discount_info = ""+(int)(this.discount*100)+"%";
        __CLR4_4_18080luut6nzh.R.inc(338);String sep = System.getProperty("line.separator");
        __CLR4_4_18080luut6nzh.R.inc(339);if((((this.discount==1)&&(__CLR4_4_18080luut6nzh.R.iget(340)!=0|true))||(__CLR4_4_18080luut6nzh.R.iget(341)==0&false)))
            {__CLR4_4_18080luut6nzh.R.inc(342);discount_info = "No discount";
        }__CLR4_4_18080luut6nzh.R.inc(343);String info = "Name\u951b\ufffd"+this.name+
                sep +"Price\u951b\ufffd"+OrderItem.formatDouble(this.price)+"Yuan"+
                sep +"Discount: "+discount_info+
                sep +"Quantity\u951b\ufffd"+this.count;
        __CLR4_4_18080luut6nzh.R.inc(344);return info;
    }finally{__CLR4_4_18080luut6nzh.R.flushNeeded();}}


}
