/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
import java.util.Comparator;
import java.util.Random;

/**
 * A class that contains several sorting routines,
 * implemented as static methods.
 * Arrays are rearranged with smallest item first,
 * using compareTo.
 * @author Mark Allen Weiss
 */
public final class Sorting
{public static class __CLR4_4_100lugph467{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0031\u0030\u0031\u005c\u005c\u0037\u0036\u005c\u005c\u0053\u006f\u0072\u0074\u0069\u006e\u0067\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1711961163620L,8589935092L,79,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Simple insertion sort.
     * @param a an array of Comparable items.
     */
    public void insertionSort( int[ ] a )
    {try{__CLR4_4_100lugph467.R.inc(0);
        __CLR4_4_100lugph467.R.inc(1);int j;

        __CLR4_4_100lugph467.R.inc(2);for( int p = 1; (((p < a.length)&&(__CLR4_4_100lugph467.R.iget(3)!=0|true))||(__CLR4_4_100lugph467.R.iget(4)==0&false)); p++ )
        {{
             __CLR4_4_100lugph467.R.inc(5);int tmp = a[ p ];
            __CLR4_4_100lugph467.R.inc(6);for( j = p; (((j > 0 && tmp<a[ j - 1 ])&&(__CLR4_4_100lugph467.R.iget(7)!=0|true))||(__CLR4_4_100lugph467.R.iget(8)==0&false)); j-- )
                 {__CLR4_4_100lugph467.R.inc(9);a[ j ] = a[ j - 1 ];
            }__CLR4_4_100lugph467.R.inc(10);a[ j ] = tmp;
        }
    }}finally{__CLR4_4_100lugph467.R.flushNeeded();}}

    public  boolean isSorted(int[] a) {try{__CLR4_4_100lugph467.R.inc(11);
        __CLR4_4_100lugph467.R.inc(12);for(int i=0; (((i<a.length-1)&&(__CLR4_4_100lugph467.R.iget(13)!=0|true))||(__CLR4_4_100lugph467.R.iget(14)==0&false)); i++) {{
            __CLR4_4_100lugph467.R.inc(15);if((((a[i]>a[i+1])&&(__CLR4_4_100lugph467.R.iget(16)!=0|true))||(__CLR4_4_100lugph467.R.iget(17)==0&false))) {{
                __CLR4_4_100lugph467.R.inc(18);return false;
            }
        }}
        }__CLR4_4_100lugph467.R.inc(19);return true;
    }finally{__CLR4_4_100lugph467.R.flushNeeded();}}

    public static void quicksort( int[ ] a )
    {try{__CLR4_4_100lugph467.R.inc(20);
        __CLR4_4_100lugph467.R.inc(21);quicksort( a, 0, a.length - 1 );
    }finally{__CLR4_4_100lugph467.R.flushNeeded();}}

    private static final int CUTOFF = 10;

    public static final void swapReferences( Object [ ] a, int index1, int index2 )
    {try{__CLR4_4_100lugph467.R.inc(22);
        __CLR4_4_100lugph467.R.inc(23);Object tmp = a[ index1 ];
        __CLR4_4_100lugph467.R.inc(24);a[ index1 ] = a[ index2 ];
        __CLR4_4_100lugph467.R.inc(25);a[ index2 ] = tmp;
    }finally{__CLR4_4_100lugph467.R.flushNeeded();}}
    public static final void swap(int[] a,int index1,int index2) {try{__CLR4_4_100lugph467.R.inc(26);
        __CLR4_4_100lugph467.R.inc(27);int tmp = a[ index1 ];
        __CLR4_4_100lugph467.R.inc(28);a[ index1 ] = a[ index2 ];
        __CLR4_4_100lugph467.R.inc(29);a[ index2 ] = tmp;
    }finally{__CLR4_4_100lugph467.R.flushNeeded();}}

    private static int median3( int[ ] a, int left, int right )
    {try{__CLR4_4_100lugph467.R.inc(30);
        __CLR4_4_100lugph467.R.inc(31);int center = ( left + right ) / 2;
        __CLR4_4_100lugph467.R.inc(32);if( (((a[ center ]<a[ left ] )&&(__CLR4_4_100lugph467.R.iget(33)!=0|true))||(__CLR4_4_100lugph467.R.iget(34)==0&false)))
            {__CLR4_4_100lugph467.R.inc(35);swap( a, left, center );
        }__CLR4_4_100lugph467.R.inc(36);if( (((a[ right ] < a[ left ] )&&(__CLR4_4_100lugph467.R.iget(37)!=0|true))||(__CLR4_4_100lugph467.R.iget(38)==0&false)))
            {__CLR4_4_100lugph467.R.inc(39);swap( a, left, right );
        }__CLR4_4_100lugph467.R.inc(40);if( (((a[ right ] < a[ center ] )&&(__CLR4_4_100lugph467.R.iget(41)!=0|true))||(__CLR4_4_100lugph467.R.iget(42)==0&false)))
            {__CLR4_4_100lugph467.R.inc(43);swap( a, center, right );

        // Place pivot at position right - 1
        }__CLR4_4_100lugph467.R.inc(44);swap( a, center, right - 1 );
        __CLR4_4_100lugph467.R.inc(45);return a[ right - 1 ];
    }finally{__CLR4_4_100lugph467.R.flushNeeded();}}

    private static void quicksort( int[ ] a, int left, int right)
    {try{__CLR4_4_100lugph467.R.inc(46);
        __CLR4_4_100lugph467.R.inc(47);if( (((left + CUTOFF <= right )&&(__CLR4_4_100lugph467.R.iget(48)!=0|true))||(__CLR4_4_100lugph467.R.iget(49)==0&false)))
        {{
            __CLR4_4_100lugph467.R.inc(50);int pivot = median3( a, left, right );

            __CLR4_4_100lugph467.R.inc(51);int i = left, j = right - 1;
            __CLR4_4_100lugph467.R.inc(52);for( ; ; )
            {{
                __CLR4_4_100lugph467.R.inc(53);while( (((a[ ++i ] < pivot )&&(__CLR4_4_100lugph467.R.iget(54)!=0|true))||(__CLR4_4_100lugph467.R.iget(55)==0&false)))  {{ }
                }__CLR4_4_100lugph467.R.inc(56);while( (((a[ --j ] > pivot )&&(__CLR4_4_100lugph467.R.iget(57)!=0|true))||(__CLR4_4_100lugph467.R.iget(58)==0&false))) {{ }
                }__CLR4_4_100lugph467.R.inc(59);if( (((i < j )&&(__CLR4_4_100lugph467.R.iget(60)!=0|true))||(__CLR4_4_100lugph467.R.iget(61)==0&false)))
                     {__CLR4_4_100lugph467.R.inc(62);swap( a, i, j );
                }else
                    {__CLR4_4_100lugph467.R.inc(63);break;
            }}

            }__CLR4_4_100lugph467.R.inc(64);swap( a, i, right - 1 );   // Restore pivot

            __CLR4_4_100lugph467.R.inc(65);quicksort( a, left, i - 1 );    // Sort small elements
            __CLR4_4_100lugph467.R.inc(66);quicksort( a, i + 1, right );   // Sort large elements
        }
        }else  // Do an insertion sort on the subarray
            {__CLR4_4_100lugph467.R.inc(67);insertionSort( a, left, right );
    }}finally{__CLR4_4_100lugph467.R.flushNeeded();}}

    private static void insertionSort( int[ ] a, int left, int right )
    {try{__CLR4_4_100lugph467.R.inc(68);
        __CLR4_4_100lugph467.R.inc(69);for( int p = left + 1; (((p <= right)&&(__CLR4_4_100lugph467.R.iget(70)!=0|true))||(__CLR4_4_100lugph467.R.iget(71)==0&false)); p++ )
        {{
            __CLR4_4_100lugph467.R.inc(72);int tmp = a[ p ];
            __CLR4_4_100lugph467.R.inc(73);int j;

            __CLR4_4_100lugph467.R.inc(74);for( j = p; (((j > left && tmp < a[ j - 1 ])&&(__CLR4_4_100lugph467.R.iget(75)!=0|true))||(__CLR4_4_100lugph467.R.iget(76)==0&false)); j-- )
                {__CLR4_4_100lugph467.R.inc(77);a[ j ] = a[ j - 1 ];
            }__CLR4_4_100lugph467.R.inc(78);a[ j ] = tmp;
        }
    }}finally{__CLR4_4_100lugph467.R.flushNeeded();}}

    private static final int NUM_ITEMS = 1000;
    private static int theSeed = 1;

}
