package Homework4;

public class StatementsUtil {
    public static void main(String[] args) {
        StatementsUtil obj = new StatementsUtil();
        System.out.println(obj.isNumberEven(45)); // 1
        System.out.println(obj.checkIt(-12)); // 2
        System.out.println(obj.checkRange(19)); // 3
        System.out.println(obj.check5n7(35)); // 4
        System.out.println(obj.checkIfTN7(428)); // 5
        System.out.println(obj.checkIfInsideTheCircle(0, 5, 4)); // 6
        System.out.println(obj.theBiggest(1, 2, 3)); // 7
        System.out.println(obj.nahanjTari(2024)); // 8
        obj.from1to200(200); // 11
        System.out.println(obj.firstDigit(7634587)); // 12
        System.out.println(obj.printXplusY(1, 0)); // 13
        obj.printSquare(6); // 14
        System.out.println(obj.from1toNDividedBy5(45)); // 15
        System.out.println(obj.twins(40)); // 16
        System.out.println(obj.tvabanakanMijin(1600)); // 17
        System.out.println(obj.sum(12345));


    }

    // 1․ Գրել method, որը ստուգում է տրված x ամբողջ  թիվը զույգ է թե կենտ.

    /**
     * This method check if the number is even or not.
     * @return {@code true} the number is evan {@code false} the number isn't even
     */
    public boolean isNumberEven(int x) {
        return x % 2 == 0;
    }

    // 2. Գրել method, որը ստուգում է տրված  x ամբողջ  թիվը դրական է թե բացասական.

    /**
     * This method shows whether a number is positive or negative.
     * @return positive or negative
     */
    public String checkIt(int x) {
        if (x > 0) {
            return "Number " + x + " is positive";
        }
        else if (x < 0) {
            return "Number " + x + " is negative";
        }
        else {
            return "The number is zero";
        }
    }

    // 3. Գրել method, որը ստուգում է տրված x ամբողջ  թիվը  ՝ կամ փոքր 8 ից  և մեծ 5 ից Կամ փոքր 20 ից և մեծ 15 ից ․

    /**
     * Checks if the number is range between 5 and 8 or 15 and 20.
     * @return {@code true} it is in the given range {@code} it isn't
     */
    public boolean checkRange(int x) {
        return (x < 8 && x > 5) || (x < 20 && x > 15);
    }

    // 4. Գրել method, որը ստուգում է տրվածղ ամբողջ թիվը կարող է բաժանվել 5-ի և 7-ի վրա առանց մնացորդի.

    /**
     * Checks if the number divides by 5 and 7 without reminder.
     * @return {@code true} it does {@code false} it doesn't
     */
    public boolean check5n7(int x) {
        return (x % 5 == 0 && x % 7 == 0);
    }

    // 5. Գրել method, որը ստուգում է տրված եռանիշ թվի երկրորդ թվանշանը 7 է թե ոչ։

    /**
     * Check if the three-digit number's second digit is 7.
     * Works for both positive and negative numbers.
     * @return {@code true} The second digit is 7 {@code false} The second digit is NOT 7
     */
    public boolean checkIfTN7(int x) {
        if (x / 100 < 10 && x / 100 > -10 && x != 0) {
            x /= 10;
            x %= 10;
            return x == 7;
        }
        else {
            return false;
        }
    }

    // 6. Գրել method, որը ստուգում է (x,y) կորդինատներով կետը գտնվում է արդյոք K(0,5) շրջանի մեջ թե ոչ։

    /**
     * Checks if the given point is inside the circle.
     * @param r is the circle range
     * @return {@code true} inside {@code false} outside
     */
    public boolean checkIfInsideTheCircle(int x, int y, int r) {
        return x <= r && y <= r;
    }

    // 7. Գրել method, որը գտնում է տրված 3 թվերից մեծագույնը։

    /**
     * Prints the biggest given number.
     * @return {@code a} The biggest number is a {@code b} The biggest number is b {@code c} The biggest number is c
     */
    public int theBiggest(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        else if (b > a && b > c) {
            return b;
        }
        else {
            return c;
        }
    }

    // 8. Գրե՛ք method, որը ստուգում է տրված տարին համարվում է արդյոք նահանջ։

    /**
     * Checks if the given year is leap year.
     * @return {@code true} It is {@code false} It isn't
     */
    public boolean nahanjTari(int x) {
        return (x % 4 == 0 && x % 100 != 0) || x % 400 == 0;
    }

    // 11. Գրել method, որը console -ում  տպում է  1 ից  200 թվերը․

    /**
     * Print all the numbers from 1 to 200.
     */
    public void from1to200(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(i);
        }
    }

    // 12. Գրել method, որը console -ում տպում է տրված թվի առաջին թվանշանը.

    /**
     * Print the first digit of the number.
     * @return prints the first digit
     */
    public int firstDigit(int x) {
        while (x >= 10) {
            x /= 10;
        }
        return x;
    }

    // 13. Տրված են int x = 1, int y = 0.  Քանի դեռ x < 5 ից  և  y < 10  տպել  x+y արտահայտությունը․

    /**
     * Print x + y while x < 5 and y < 10.
     * @return Print a, which is x + y
     */
    public int printXplusY(int x, int y) {
        int a = 0;
        while (x < 5 && y < 10) {
            a = x + y;
            x++;
            y++;
        }
        return a;
    }

    // 14. . Գրել method, որը console -ում տպում է քառակուսի, օգտագործեք * սիմվոլը։

    /**
     * Print a square with * digit.
     */
    public void printSquare(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    // 15. Գրել method, որը console -ից ստանում է  N թիվը և հաշվում է [1-N] բոլոր 5 -ի բաժանվող թվերի գումարը։

    /**
     * This method print the sum of the numbers in range from 1 ot N that can be divided by 5.
     * @return Returns the sum of the numbers
     */
    public int from1toNDividedBy5(int N) {
        int sum = 0;
        for (int i = 0; i <= N; i+=5) {
            sum += i;
        }
        return sum;
    }

    // 16 Գրել method, որը հաշվում է [1-N]  բոլոր  երկնիշ զույգ թվերի արտադրյալը։

    /**
     * Calculates the product of the two-digit even numbers.
     * @return Prints the product
     */
    public long twins(int N) {
        long product = 1;
        for (int i = 10; i <= N; i += 2) {
            if (i == 100) {
                break;
            }

            product *= i;
        }

        return product;
    }

    // 17. Գրել method, որը [1-N] հաջորդական  թվերի մեջ գտնում է  մեծագույն և փոքրագույն տարրերը և հաշվում նրանց թվաբանական միջինը։

    /**
     * Calculates the tvabanakan mijin of the minimum and maximum values in 1-N range.
     * @return Prints the tvabanakan mijin
     */
    public int tvabanakanMijin(int N) {
        int min = 1;
        int max = N;
        return (min + max) / 2;
    }

    // 18. Գրել method, որը  ստանում է 5 - անիշ ամբողջ թիվ  և հաշվում  այդ թվի թվանշանների գումարը։

    /**
     * Calculates the sum of digits in a five-digit number.
     * @return Print the sum
     */
    public int sum(int x) {
        int sum = 0;
        while (x > 0 & x <= 99999){
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

}
