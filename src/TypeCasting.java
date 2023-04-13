public class TypeCasting {

    public static void main(String[] args) {
        casting1();
        /*casting2();
        casting3();
        casting4();
        casting5();
        casting6();*/
    }

/*
* integer data types byte -> short -> int -> long
* floating data types float -> double
* char
* boolean
*
* */
    private static void casting1(){
        String str = "";
        byte a = 127;
        int i = 10;
        byte b = (byte) i;
        System.out.println(b);

        short s = (short) i;
        System.out.println(s);

        long l = (long) i;
        System.out.println(l);

        float f = (float) i;
        System.out.println(f);
    }


    private static void casting2(){
        int a = 1000000;
        System.out.println("value is more than what an integer can hold ."+a * a);
        long l = a;

        System.out.println(l * l);
       // System.out.println(20296 / (l - a));

        System.out.println(-727379968 > -2147483648);
    }


    private static void casting3(){
        // An example of overflow:
        double d = 1e308;
        System.out.print("overflow produces infinity: ");
        System.out.println(d + "*10==" + d*10);
// An example of gradual underflow:
        d = 1e-305 * Math.PI;
        System.out.print("gradual underflow: " + d + "\n ");
        for (int i = 0; i < 4; i++)
            System.out.print(" " + (d /= 100000));
        System.out.println();
// An example of NaN:
        System.out.print("0.0/0.0 is Not-a-Number: ");
        d = 0.0/0.0;
        System.out.println(d);
// An example of inexact results and rounding:
        System.out.print("inexact results with float:");
        for (int i = 0; i < 100; i++) {
            float z = 1.0f / i;
            if (z * i != 1.0f)
                System.out.print(" " + i);
        }
        System.out.println();
// Another example of inexact results and rounding:
        System.out.print("inexact results with double:");
        for (int i = 0; i < 100; i++) {
            double z = 1.0 / i;
            if (z * i != 1.0)
                System.out.print(" " + i);
        }
        System.out.println();
// An example of cast to integer rounding:
        System.out.print("cast to int rounds toward 0: ");
        d = 12345.6;
        System.out.println((int)d + " " + (int)(-d));
    }


    private static void casting4(){
        //implicit conversion
        System.out.println("Implicit Type Casting");
        char a='A';
        System.out.println("Value of a: "+a);

        int b=a;
        System.out.println("Value of b: "+b);

        float c=a;
        System.out.println("Value of c: "+c);

        long d=a;
        System.out.println("Value of d: "+d);

        double e=a;
        System.out.println("Value of e: "+e);


        System.out.println("\n");

        System.out.println("Explicit Type Casting");
        //explicit conversion

        double x=45.5;
        int y=(int)x;
        System.out.println("Value of x: "+x);
        System.out.println("Value of y: "+y);
    }

    private static void casting5(){
        int x = 7;
//automatically converts the integer type into long type
        long y = x;
//automatically converts the long type into float type
        float z = y;
        System.out.println("Before conversion, int value "+x);
        System.out.println("After conversion, long value "+y);
        System.out.println("After conversion, float value "+z);
    }

    private static void casting6(){
        double d = 166.66;
//converting double data type into long data type
        long l = (long)d;
//converting long data type into int data type
        int i = (int)l;
        System.out.println("Before conversion: "+d);
//fractional part lost
        System.out.println("After conversion into long type: "+l);
//fractional part lost
        System.out.println("After conversion into int type: "+i);
    }


}
