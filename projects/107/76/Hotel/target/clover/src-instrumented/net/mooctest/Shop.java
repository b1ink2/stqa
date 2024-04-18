/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shop {public static class __CLR4_4_1bdbdluut6o1a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0031\u0030\u0037\u005c\u005c\u0037\u0036\u005c\u005c\u0048\u006f\u0074\u0065\u006c\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712813920933L,8589935092L,489,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private List<Product> products;

    public Shop(){try{__CLR4_4_1bdbdluut6o1a.R.inc(409);
        __CLR4_4_1bdbdluut6o1a.R.inc(410);products = new ArrayList<>();
    }finally{__CLR4_4_1bdbdluut6o1a.R.flushNeeded();}}

    /**
     * \u7035\u89c4\u588d\u93c8\u590a\u6662\u935d\u4f7d\u7e58\u741b\u5c7e\u5e13\u6434\u5fd3\u6097\u6748\u64b3\u56ad\u6dc7\u2103\u4f05
     */
    public String getAllProductsInfo(){try{__CLR4_4_1bdbdluut6o1a.R.inc(411);
        __CLR4_4_1bdbdluut6o1a.R.inc(412);String info = "";
        __CLR4_4_1bdbdluut6o1a.R.inc(413);String sep = System.getProperty("line.separator");
        __CLR4_4_1bdbdluut6o1a.R.inc(414);Collections.sort(products, (p1, p2) -> {
            __CLR4_4_1bdbdluut6o1a.R.inc(415);if((((p1.getPaymentPrice()>p2.getPaymentPrice())&&(__CLR4_4_1bdbdluut6o1a.R.iget(416)!=0|true))||(__CLR4_4_1bdbdluut6o1a.R.iget(417)==0&false)))
                {__CLR4_4_1bdbdluut6o1a.R.inc(418);return 1;
            }else {__CLR4_4_1bdbdluut6o1a.R.inc(419);if ((((p1.getPaymentPrice()<p2.getPaymentPrice())&&(__CLR4_4_1bdbdluut6o1a.R.iget(420)!=0|true))||(__CLR4_4_1bdbdluut6o1a.R.iget(421)==0&false)))
                {__CLR4_4_1bdbdluut6o1a.R.inc(422);return -1;
            }else{{
                __CLR4_4_1bdbdluut6o1a.R.inc(423);return p1.name.compareTo(p2.name);
            }
        }}});
        __CLR4_4_1bdbdluut6o1a.R.inc(424);for (int i = 0; (((i<products.size())&&(__CLR4_4_1bdbdluut6o1a.R.iget(425)!=0|true))||(__CLR4_4_1bdbdluut6o1a.R.iget(426)==0&false)); i++){{
            __CLR4_4_1bdbdluut6o1a.R.inc(427);info += ("No."+(i+1)+sep+products.get(i).getInfo()+sep);
        }
        }__CLR4_4_1bdbdluut6o1a.R.inc(428);return info;
    }finally{__CLR4_4_1bdbdluut6o1a.R.flushNeeded();}}


    /**
     * \u5a23\u8bf2\u59de\u935f\u55d7\u6427
     * @param product
     */
    public int addProduct(Product product){try{__CLR4_4_1bdbdluut6o1a.R.inc(429);
        __CLR4_4_1bdbdluut6o1a.R.inc(430);int productIndex = this.searchProduct(product.name);
        __CLR4_4_1bdbdluut6o1a.R.inc(431);if ((((productIndex!=-1)&&(__CLR4_4_1bdbdluut6o1a.R.iget(432)!=0|true))||(__CLR4_4_1bdbdluut6o1a.R.iget(433)==0&false))){{
            __CLR4_4_1bdbdluut6o1a.R.inc(434);products.get(productIndex).setCount(products.get(productIndex).count+product.count);
            __CLR4_4_1bdbdluut6o1a.R.inc(435);return productIndex;
        }}else{{
            __CLR4_4_1bdbdluut6o1a.R.inc(436);products.add(product);
            __CLR4_4_1bdbdluut6o1a.R.inc(437);return products.size();
        }

    }}finally{__CLR4_4_1bdbdluut6o1a.R.flushNeeded();}}

    /**
     * \u6d93\u5b2b\u7066\u935f\u55d7\u6427,\u704f\u55d7\u6662\u935d\u4f77\u7ca0\u9352\u6944\u3003\u6d93\ue15e\u57b9\u95c4\ufffd
     * @param productName
     */
    public int deletProduct(String productName){try{__CLR4_4_1bdbdluut6o1a.R.inc(438);
        __CLR4_4_1bdbdluut6o1a.R.inc(439);int productIndex = this.searchProduct(productName);
        __CLR4_4_1bdbdluut6o1a.R.inc(440);if ((((productIndex == -1)&&(__CLR4_4_1bdbdluut6o1a.R.iget(441)!=0|true))||(__CLR4_4_1bdbdluut6o1a.R.iget(442)==0&false)))
            {__CLR4_4_1bdbdluut6o1a.R.inc(443);throw new NullPointerException("Product is not exists.");
        }else
            {__CLR4_4_1bdbdluut6o1a.R.inc(444);products.remove(productIndex);
        }__CLR4_4_1bdbdluut6o1a.R.inc(445);return productIndex;
    }finally{__CLR4_4_1bdbdluut6o1a.R.flushNeeded();}}

    /**
     * \u9351\u54c4\u656d\u935f\u55d7\u6427
     * @param productName
     * @param count
     */
    public int sellProduct(String productName, int count){try{__CLR4_4_1bdbdluut6o1a.R.inc(446);
        __CLR4_4_1bdbdluut6o1a.R.inc(447);int productIndex = this.searchProduct(productName);
        __CLR4_4_1bdbdluut6o1a.R.inc(448);if ((((productIndex == -1)&&(__CLR4_4_1bdbdluut6o1a.R.iget(449)!=0|true))||(__CLR4_4_1bdbdluut6o1a.R.iget(450)==0&false)))
            {__CLR4_4_1bdbdluut6o1a.R.inc(451);throw new NullPointerException("Product is not exists.");
        }else {__CLR4_4_1bdbdluut6o1a.R.inc(452);if ((((products.get(productIndex).count<count)&&(__CLR4_4_1bdbdluut6o1a.R.iget(453)!=0|true))||(__CLR4_4_1bdbdluut6o1a.R.iget(454)==0&false)))
            {__CLR4_4_1bdbdluut6o1a.R.inc(455);throw new IllegalArgumentException("Quantity of remaining products is not enough.");
        }else {__CLR4_4_1bdbdluut6o1a.R.inc(456);if ((((count<=0)&&(__CLR4_4_1bdbdluut6o1a.R.iget(457)!=0|true))||(__CLR4_4_1bdbdluut6o1a.R.iget(458)==0&false)))
            {__CLR4_4_1bdbdluut6o1a.R.inc(459);throw new IllegalArgumentException("Count cannot less than 0.");
        }}}__CLR4_4_1bdbdluut6o1a.R.inc(460);products.get(productIndex).setCount(products.get(productIndex).count-count);
        __CLR4_4_1bdbdluut6o1a.R.inc(461);return products.get(productIndex).count;
    }finally{__CLR4_4_1bdbdluut6o1a.R.flushNeeded();}}

    /**
     * \u93c7\u5b58\u67ca\u935f\u55d7\u6427\u6dc7\u2103\u4f05
     * @param productName
     * @param price
     */
    public Product updateProduct(String productName, double price, double discount){try{__CLR4_4_1bdbdluut6o1a.R.inc(462);
        __CLR4_4_1bdbdluut6o1a.R.inc(463);int productIndex = this.searchProduct(productName);
        __CLR4_4_1bdbdluut6o1a.R.inc(464);if ((((productIndex == -1)&&(__CLR4_4_1bdbdluut6o1a.R.iget(465)!=0|true))||(__CLR4_4_1bdbdluut6o1a.R.iget(466)==0&false)))
            {__CLR4_4_1bdbdluut6o1a.R.inc(467);throw new NullPointerException("Product is not exists.");
        }__CLR4_4_1bdbdluut6o1a.R.inc(468);products.get(productIndex).setPrice(price);
        __CLR4_4_1bdbdluut6o1a.R.inc(469);products.get(productIndex).setDiscount(discount);
        __CLR4_4_1bdbdluut6o1a.R.inc(470);return products.get(productIndex);
    }finally{__CLR4_4_1bdbdluut6o1a.R.flushNeeded();}}


    /////
    public int searchProduct(String productName){try{__CLR4_4_1bdbdluut6o1a.R.inc(471);
        __CLR4_4_1bdbdluut6o1a.R.inc(472);int index = -1;
        __CLR4_4_1bdbdluut6o1a.R.inc(473);for(int i = 0; (((i<products.size())&&(__CLR4_4_1bdbdluut6o1a.R.iget(474)!=0|true))||(__CLR4_4_1bdbdluut6o1a.R.iget(475)==0&false)); i++){{
            __CLR4_4_1bdbdluut6o1a.R.inc(476);if ((((products.get(i).name.equals(productName))&&(__CLR4_4_1bdbdluut6o1a.R.iget(477)!=0|true))||(__CLR4_4_1bdbdluut6o1a.R.iget(478)==0&false))){{
                __CLR4_4_1bdbdluut6o1a.R.inc(479);index = i;
                __CLR4_4_1bdbdluut6o1a.R.inc(480);break;
            }
        }}
        }__CLR4_4_1bdbdluut6o1a.R.inc(481);return index;
    }finally{__CLR4_4_1bdbdluut6o1a.R.flushNeeded();}}

    /////
    public Product getProductByName(String productName){try{__CLR4_4_1bdbdluut6o1a.R.inc(482);
        __CLR4_4_1bdbdluut6o1a.R.inc(483);int index = searchProduct(productName);
        __CLR4_4_1bdbdluut6o1a.R.inc(484);if ((((index<0)&&(__CLR4_4_1bdbdluut6o1a.R.iget(485)!=0|true))||(__CLR4_4_1bdbdluut6o1a.R.iget(486)==0&false)))
            {__CLR4_4_1bdbdluut6o1a.R.inc(487);return null;
        }__CLR4_4_1bdbdluut6o1a.R.inc(488);return products.get(index);
    }finally{__CLR4_4_1bdbdluut6o1a.R.flushNeeded();}}


}
