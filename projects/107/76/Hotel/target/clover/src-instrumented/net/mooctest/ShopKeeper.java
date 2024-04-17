/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ShopKeeper {public static class __CLR4_4_1dldlluut6o1n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0031\u0030\u0037\u005c\u005c\u0037\u0036\u005c\u005c\u0048\u006f\u0074\u0065\u006c\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712813920933L,8589935092L,507,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Shop shop = new Shop();

    public void setShop(Shop shop){try{__CLR4_4_1dldlluut6o1n.R.inc(489);
        __CLR4_4_1dldlluut6o1n.R.inc(490);this.shop = shop;
    }finally{__CLR4_4_1dldlluut6o1n.R.flushNeeded();}}

    public void showAllProducts(){try{__CLR4_4_1dldlluut6o1n.R.inc(491);
        __CLR4_4_1dldlluut6o1n.R.inc(492);System.out.print(shop.getAllProductsInfo());
    }finally{__CLR4_4_1dldlluut6o1n.R.flushNeeded();}}

    /**
     * \u95bf\ufffd\u935e\ue1bb\u7af4\u93b5\u7470\u6662\u935d\ufffd
     * @param products
     */
    public void sellProducts(Map<String, Integer> products){try{__CLR4_4_1dldlluut6o1n.R.inc(493);
        __CLR4_4_1dldlluut6o1n.R.inc(494);List<OrderItem> items = new ArrayList<>();
        __CLR4_4_1dldlluut6o1n.R.inc(495);for (String productName:products.keySet()){{
            __CLR4_4_1dldlluut6o1n.R.inc(496);try{
                __CLR4_4_1dldlluut6o1n.R.inc(497);shop.sellProduct(productName, products.get(productName));
                __CLR4_4_1dldlluut6o1n.R.inc(498);Product product = shop.getProductByName(productName);
                __CLR4_4_1dldlluut6o1n.R.inc(499);items.add(new OrderItem(productName, product.getPaymentPrice(), products.get(productName)));
                __CLR4_4_1dldlluut6o1n.R.inc(500);System.out.println("Selld Successfully:"+productName+"*"+products.get(productName));
            }catch (Exception e){
            	__CLR4_4_1dldlluut6o1n.R.inc(501);System.out.println("Selld Failed:"+e.getMessage());
                __CLR4_4_1dldlluut6o1n.R.inc(502);continue;
            }
        }
        }__CLR4_4_1dldlluut6o1n.R.inc(503);if ((((items.size()>0)&&(__CLR4_4_1dldlluut6o1n.R.iget(504)!=0|true))||(__CLR4_4_1dldlluut6o1n.R.iget(505)==0&false))){{
            __CLR4_4_1dldlluut6o1n.R.inc(506);Order.createOrder(items);
        }
    }}finally{__CLR4_4_1dldlluut6o1n.R.flushNeeded();}}

}
