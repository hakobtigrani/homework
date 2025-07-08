public class Operators {
    public static void main(String[] args) {

        /**
         * Ստեղծել 2 փոփոխական(int a = 8, int b = 6), տպել console -ում  հետևյալը․
         * a + b
         * a * b
         * a / b
         * a - b
         * a % b
         */

        int a = 8;
        int b = 6;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        /**
         * Ստեղծել 2 փոփոխական(double c = 6.4, double d = 0.03), տպել  console -ում հետևյալը.
         * c + d
         * c * d
         * c / d
         * c - d
         * c % d
         */

        double c = 6.4;
        double d = 0.03;
        System.out.println("c + d = " + (c + d));
        System.out.println("c - d = " + (c - d));
        System.out.println("c * d = " + (c * d));
        System.out.println("c / d = " + (c / d));
        System.out.println("c % d = " + (c % d));

        /**
         * Տպել  console -ում  հետևյալ արտահայտությունների պատասխանները`
         * int x = 2 * ((5 + 3) * 4 – 8);
         * int y = 2 * 5 + 3 * 4 - 8;
         */

        int x = 2 * ((5 + 3) * 4 - 8);
        int y = 2 * 5 + 3 * 4 - 8;
        System.out.println("x = " + x + ", y = " + y);

        /**
         * Ստեղծել 2 փոփոխական(int e = 10,  int f = -88, boolean n1 = true), տպել console -ում  հետևյալը․
         *
         * 1)-e
         * 2)-f
         * 3)+e
         * 4)-e +92
         * 5)!n1
         * 6)!(!n1)
         * 7)e++
         * 8)--f
         * 9) int x = 3;
         *    int y = ++x * 5 / x-- + --x;
         *    System.out.println("x is " + x);
         *    System.out.println("y is " + y);
         */

        int e = 10;
        int f = -88;
        boolean n1 = true;
        System.out.println("-e = " + -e); // 1
        System.out.println("-f = " + -f); // 2
        System.out.println("+e = " + +e); // 3
        System.out.println("-e + 96 = " + -e + 96); // 4
        System.out.println("!n1 = " + !n1); // 5
        System.out.println("!(!n1) = " + n1); // 6
        System.out.println("e++ = " + e++); // 7
        System.out.println("--f = " + --f); // 8
        int x1 = 3; // 9
        int y1 = ++x * 5 / x-- + --x;
        System.out.println("x1 is " + x1);
        System.out.println("y1 is " + y1);

        /**
         * Տպել  console -ում  հետևյալ արտահայտությունների պատասխանները`
         * 1) int x = (int)1.0;
         * 2) short y = (short)1921222;
         * 3) System.out.print(2147483647+1);
         * 4) long y = (x=3);
         * 5) boolean a = false;
         *    boolean b = (y = true);
         *    System.out.println(x);
         */

        int x2 = (int)1.0;
        short y2 = (short)1921222;
        System.out.println(2147483647 + 1);
//        long y2 = (x2 = 3); // prints error
        boolean a1 = false;
        boolean b1 = (a1 = true);
        System.out.println("x2 = " + x2);

        /**
         * Ստեղծել 2 փոփոխական(int x = 10, int y = 20), տպել console -ում  հետևյալը․
         *
         * 1) System.out.println(x < y);
         * 2) System.out.println(x <= y);
         * 3) System.out.println(x >= y);
         * 4) System.out.println(x > y);
         */

        int x3 = 10;
        int y3 = 20;
        System.out.println("1) " + (x3 < y3));
        System.out.println("1) " + (x3 <= y3));
        System.out.println("1) " + (x3 >= y3));
        System.out.println("1) " + (x3 > y3));

        /**
         * Գտնե և ուղղել սխալը․
         *
         *   1)  float y = 2.1;
         *
         *   2)  byte x = 5;
         *        byte y = 10;
         *        byte z = x + y;
         *
         *  3)   short x = 10;
         *        short y = 3;
         *        short z = x * y;
         *
         *  4)    long x = 10;
         *        int y = 5;
         *        y = y * x;
         */

        // 1
        float yf = 2.1f;
        // 2
        byte xb = 5;
        byte yb = 10;
        byte zb = (byte) (xb + yb);
        // 3
        short xs = 10;
        short ys = 3;
        short zs = (short) (xs * ys);
        // 4
        long xl = 10;
        long yl = 5;
        yl *= xl;

        /**
         * Հայտարարել երկու int տիպի փոփոխականներ, վերագրել 10 և 5 այնուհետև փոփոխականի արժեքները տեղերով փոխել։
         */

        int i1 = 10;
        int i2 = 5;
        int temp = i1;
        i1 = i2;
        i2 = temp;
        // qele stugenq
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        // dzec ashxatec

        /**
         * Փորձեք 8-րդ խնդիրը լուծել առանց երրորդ փոփոխական օգտագործելու։
         */

        int i3 = 10;
        int i4 = 5;

        // lav hesa mi ban mtacem
        i3 += i4; // i3 = 15
        i4 = i3 - i4; // i4 = 10
        i3 -= i4; // i3 = 5
        // hesa stugenq
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        // dzec ashxatec

        /**
         * Գրել ծրագիր, որը հաշվում է  1-100 թվերի գումարը։ (ցիկլ չoգտագործել)
         */

        int sum = 100 * (100 + 1) / 2; // prost matem
        System.out.println(sum);

        /**
         * Ստեղծել 2 փոփոխական(int a = 8, int b = 3), տպել console -ում  հետևյալը․
         * a & b
         * a ^ b
         * a | b
         * ~a
         * true || (a < 4)
         * (b >= 6) || (++a <= 7);
         * (a<b)?a:b
         * b^b
         */

        int aa = 8;
        int bb = 3;
        System.out.println("aa & bb = " + (aa & bb));
        System.out.println("aa ^ bb = " + (aa ^ bb));
        System.out.println("aa / bb = " + (aa / bb));
        System.out.println("~aa = " + ~aa);
        System.out.println("true || (a < 4) = " + (true || (a < 4)));
        System.out.println("(b >= 6) || (++a <= 7) = " + ((b >= 6) || (++a <= 7)));
        System.out.println("(a < b) ? a:b = " + ((a < b) ? a:b));
        System.out.println("b ^ b = " + (b ^ b));

        /**
         * Տպել console -ում  հետևյալը․
         *  10 << 2
         * -10 << 3
         * 20 >> 2
         * 15 >> 3
         */

        System.out.println("10 << 2 = " + (10 << 2));
        System.out.println("-10 << 3 = " + (-10 << 3));
        System.out.println("20 >> 2 = " + (20 >> 2));
        System.out.println("15 >> 3 = " + (15 >> 3));

        /**
         * Տրված փոփոխականը բազմապատկեք 8-ով և 16-ով առանց օգտագործելու *-նշանը։
         */

        byte ar = 2;
        int times8 = ar << 3;
        int times16 = ar << 4;
        System.out.println("ar *  8 = " + times8);
        System.out.println("ar *  16 = " + times16);

    }

}