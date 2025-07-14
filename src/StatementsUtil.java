public class StatementsUtil {
    public static void main(String[] args) {
        int x = 3; // 1
        checkEvenOdd(x);

        int x1 = 0; // 2
        checkPositiveNegative(x1);

        int x2 = 2; // 3
        checkRange(x2);

        int x3 = 35; // 4
        division5or7(x3);

        int x4 = 276; // 5
        isIt7(x4);

        int x5 = 0; // 6
        int y5 = 5;
        int radius = 6;
        inCircle(x5, y5, radius);

        int number1 = 1; // 7
        int number2 = 2;
        int number3 = 3;
        checkTheBiggest(number1, number2, number3);

        int nahanjTari = 2000; // 8
        nahanjTariCheck(nahanjTari);

        alotNumbers(); // 11

        int tiv = 679; // 12
        arajiTivPrint(tiv);

        int xx = 1; // 13
        int yy = 0;
        qaniDer(xx, yy);

        qarakusiPrint(5); // 14

        int numb = 12; // 15
        plusNumb(numb);

        int N = 24; // 16
        plusN(N);

        int n = 16; // 17
        tvabanakanMijin(n);

        int h5 = 12345; // 18
        hnganish(h5);
    }

    /**
         * 1․ Գրել method, որը ստուգում է տրված x ամբողջ  թիվը զույգ է թե կենտ.
         */

    public static void checkEvenOdd(int x) {

        if (x % 2 == 0) {
            System.out.println("it's զույգ");
        }
        else {
            System.out.println("it's կենտ է");
        }
    }

    /**
         * 2. Գրել method, որը ստուգում է տրված  x ամբողջ  թիվը դրական է թե բացասական.
         */

    public static void checkPositiveNegative(int x1) {
        if (x1 > 0) {
            System.out.println("it's դրական");
        }
        else if (x1 < 0) {
            System.out.println("it's բացասական");
        }
        else {
            System.out.println("it's zero bro");
        }
    }


    /**
         * 3․ Գրել method, որը ստուգում է տրված x ամբողջ  թիվը  ՝ կամ փոքր 8 ից  և մեծ 5 ից Կամ փոքր  20 ից և մեծ 15 ից ․
         */

    public static void checkRange(int x2) {
        if ((x2 < 8 && x2 > 5) || (x2 < 20 && x2 > 15)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    /**
         * 4.Գրել method, որը ստուգում է տրվածղ ամբողջ թիվը կարող է բաժանվել 5-ի և 7-ի վրա առանց մնացորդի.
         */

    public static void division5or7(int x3) {
        if (x3 % 5 == 0 && x3 % 7 == 0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    /**
     * 5․ Գրել method, որը ստուգում է տրված եռանիշ թվի երկրորդ թվանշանը 7 է թե ոչ։
     * Օրինակ։ 974 -> true, 846 -> false
     */

    public static void isIt7(int x4) {
        if ((x4 / 10) % 10 == 7) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    /**
     * 6․ Գրել method, որը ստուգում է (x,y) կորդինատներով կետը գտնվում է արդյոք K(0,5) շրջանի մեջ թե ոչ։
     */

    public static void inCircle(int x5, int y5, int radius) {
        int centerX = 0;
        int centerY = 5;

        int dx = x5 - centerX;
        int dy = y5 - centerY;

        if (dx * dx + dy * dy <= radius * radius) {
            System.out.println("inside");
        }
        else {
            System.out.println("outside");
        }
    }

    /**
     * 7. Գրել method, որը գտնում է տրված 3 թվերից մեծագույնը։
     */

    public static void checkTheBiggest(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            System.out.println("The biggest number is " + number1);
        }
        else if (number2 > number1 && number2 > number3) {
            System.out.println("The biggest number is " + number2);
        }
        else if (number3 > number2 && number3 > number1) {
            System.out.println("The biggest number is " + number3);
        }
        else {
            System.out.println("error");
        }
    }

    /**
     * 8․ Գրե՛ք method, որը ստուգում է տրված տարին համարվում է արդյոք նահանջ։
     */

    public static void nahanjTariCheck(int nahanjTari) {
        if ((nahanjTari % 4 == 0) && (nahanjTari % 100 != 0) || (nahanjTari % 400 == 0)) {
            System.out.println(nahanjTari + " is nahanj tari");
        }
        else {
            System.out.println(nahanjTari + " isn't nahanj tari");
        }
    }

    /**
     * 11.Գրել method, որը console -ում  տպում է  1 ից  200 թվերը․
     */

    public static void alotNumbers() {
        for (int num = 1; num <= 200; num++) {
            System.out.println(num);
        }
    }

    /**
     * 12․  Գրել method, որը console -ում տպում է տրված թվի առաջին թվանշանը.
     */

    public static void arajiTivPrint(int tiv) {
        while (tiv >= 10) {
            tiv /= 10;
            System.out.println(tiv);
        }
    }

    /**
     * 13. Տրված են int x = 1, int y = 0.  Քանի դեռ x < 5 ից  և  y < 10  տպել  x+y արտահայտությունը․
     */

    public static void qaniDer(int xx, int yy) {
        while (xx < 5 && yy < 10) {
            System.out.println("xx + yy = " + xx + yy);
            break;
        }
    }

    /**
     * 14. Գրել method, որը console -ում տպում է քառակուսի, օգտագործեք * սիմվոլը։
     */

    public static void qarakusiPrint(int size) {
        for (int ii = 0; ii < size; ii++) {
            for (int iii = 0; iii < size; iii++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * 15․ Գրել method, որը console -ից ստանում է  N թիվը և հաշվում է [1-N] բոլոր 5 -ի բաժանվող թվերի գումարը։
     */

    public static void plusNumb(int numb) {
        int sum = 0;
        for (int f = 1; f <= numb; f++) {
            if (f % 5 == 0) {
                sum += f;
            }
            System.out.println("The sum = " + sum);
        }
    }

    /**
     * 16. Գրել method, որը հաշվում է [1-N]  բոլոր  երկնիշ զույգ թվերի արտադրյալը։
     */

    public static void plusN(int N) {
        int sum1 = 0;
        for (int g = 10; g <= N && g <= 99; g++) {
            if (g % 2 == 0) {
                sum1 += g;
            }
        }
        System.out.println("The sum1 = " + sum1);
    }

    /**
     * 17․ Գրել method, որը [1-N] հաջորդական  թվերի մեջ գտնում է  մեծագույն և փոքրագույն տարրերը և հաշվում նրանց թվաբանական միջինը։
     */

    public static void tvabanakanMijin(int n) {
        int min = 1;
        int max = n;
        double mijin = (min + max) / 2.0;

        System.out.println(mijin);
    }

    /**
     * 18․ Գրել method, որը  ստանում է 5 - անիշ ամբողջ թիվ  և հաշվում  այդ թվի թվանշանների գումարը։
     */

    public static void hnganish(int h5) {
        if (h5 < 0) {
            h5 *= -1;
        }
        int sum = 0;

        while(h5 > 0){
            sum += h5 % 10;
            h5 /= 10;
        }
        System.out.println(sum);
    }
}
