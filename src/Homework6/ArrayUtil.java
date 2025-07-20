package Homework6;

import javax.swing.event.InternalFrameEvent;
import java.sql.PreparedStatement;
import java.util.*;

public class ArrayUtil {
    public static void main(String[] args) {

        // 1
        int[] n = {-3, 2, 1, -9, 8};
        PositiveNumbers(n);

        // 2
        short[] s = {1, 2, 3, 4, 5};
        ReverseNumbers(s);

        // 3
        long[] l = {6, 7, 8, 9};
        TheBiggest(l);

        // 4
        float[] f = {1, 3, 5, 7};
        TheSmallest(f);

        // 5
        int[] m = {1, 2, 3};
        Shipping(m);


        // 6
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};
        TheSum(array1, array2);

        // 7
        int[] k = {1, 1, 1, 2, 3};
        int target = 1;
        HowManyTimes(k, target);

        // 8
        int[] notRepeating = {1, 2, 3, 4};
        NotRepeating(notRepeating);

        // 9
        int[] highsToLows = {2, 4, 3, 1};
        HighsToLows(highsToLows);

        // 10
        int[] oddsAtTheEnd = {1, 2, 3, 4};
        OddsAtTheEnd(oddsAtTheEnd);

        // 11
        int[] removeZeros = {0, 1, 2, 0, 0, 3, 0, 4};
        RemoveZeros(removeZeros);

        // 12
        int[] numbers = {1, 5, 6, 4, 9, 0, 4, 7, 7, 9, 1};
        LongestIncreasingSubsequence(numbers);

        // 13
//        zeroOnes();

        // 14
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        aboveMainDiagonal(matrix);

        // 15
        // using the matrix from 14
        transposeMatrix(matrix);
        printMatrix(matrix);

        // 16
        int[][] matrixA = {   // for YES
                {1,-1,0,0},
                {2,-2,1,-1},
                {9,7,1,-17}

        };
//        int[][] matrixA = {  // for NO
//                {1,2,0,0},
//                {2,-2,1,-1},
//                {9,7,1,-17}
//
//        };
        checkEvenRowSums(matrixA);
    }

    // 1. Գրել method, որը տպում է int[] n  array-ի դրական տարրերը․

    /**
     * This method prints out the positive numbers of the given array.
     * @param n
     */
    public static void PositiveNumbers(int[] n) {

        System.out.println("1:");
        System.out.println();

        for (int number : n) {
            if (number > 0) {
                System.out.println(number);
            }
        }
        System.out.println();
    }

    // 2. Գրել method, որը տպում է short[] s  array-ի էլեմենտները հակառակ հերթականությամբ.

    /**
     * This method reverses the array.
     * @param s
     */
    public static void ReverseNumbers(short[] s) {

        System.out.println("2:");
        System.out.println();

        for (int i = s.length - 1; i >= 0; i--) {
            System.out.println(s[i] + " ");
        }
        System.out.println();
    }

    // 3. Գրել method, որը գտնում և  տպում է  long[] l array-ի ամենամեծ տարրը․

    /**
     * This method finds the biggest element in the given array.
     * @param l
     */
    public static void TheBiggest(long[] l) {

        System.out.println("3:");
        System.out.println();

        long max = 0;

        for (long o : l) {
            if (o > max) {
                max = o;
            }
        }
        System.out.println(max);
        System.out.println();
    }

    // 4. Գրել method, որը գտնում և տպում է  float[] f  array-ի ամենափոքր տարրը․

    /**
     * This method finds the smallest element in the given array.
     * @param f
     */
    public static void TheSmallest(float[] f) {

        System.out.println("4:");
        System.out.println();

        float min = f.length - 1;

        for (float o : f) {
            if (o < min) {
                min = o;
            }
        }
        System.out.println(min);
        System.out.println();
    }

    // 5. Գրել method, որը int[] n array-ի էլեմենտները և տեղափոխում  int[] m  array-ի մեջ։

    /**
     * This method ks moving hte elements from one array to another.
     * @param m
     */
    public static void Shipping(int[] m) {

        System.out.println("5:");
        System.out.println();

        int[] datark = new int[m.length];

        for (int i = 0; i < m.length; i++) {
            datark[i] = m[i];
            m[i] = 0;
        }
        System.out.println(Arrays.toString(datark));
        System.out.println(Arrays.toString(m));
        System.out.println();
    }

    // 6. Գրել method, որը ստեղծում է երկու նույն չափը ունեցող array-ներ
    //    գումարում է array -ի համապատասխան էլեմենտները և գրում երրորդ array-ի մեջ։

    /**]
     * This method gives the sum of each index respectfully.
     * @param array1
     * @param array2
     */
    public static void TheSum(int[] array1, int[] array2) {

        System.out.println("6:");
        System.out.println();

        int[] array3 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] + array2[i];
        }

        System.out.println(Arrays.toString(array3));
        System.out.println();
    }

    // 7. Գրել method, որը հաշվում է թե քանի անգամ է  k թիվը հանդիպել array-ի  Էլեմենտների մեջ։

    public static void HowManyTimes(int[] k, int target) {

        System.out.println("7:");
        System.out.println();

        int count = 0;

        for (int i : k) {
            if (i == target) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println();
    }

    // 8. Գրել method, որը  տպում է բոլոր չկրկնվող եռյակները array -ի։ Եռյակներում թվերի դասավորությունը էական չէ:

    /**
     * This method prints all the possible ways for triplets.
     * @param notRepeating
     */
    public static void NotRepeating(int[] notRepeating) {
        Set<List<Integer>> uniqueTriplets = new HashSet<>();
        int n = notRepeating.length;

        System.out.println("8:");
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    List<Integer> triplets = Arrays.asList(notRepeating[i], notRepeating[j], notRepeating[k]);
                    Collections.sort(triplets);
                    if (!uniqueTriplets.contains(triplets)) {
                        uniqueTriplets.add(triplets);
                        System.out.println(triplets);
                    }
                }
            }
        }
        System.out.println();
    }

    // 9. Դասավորել տրված թվերի հաջորդականության անդամները նվազման կարգով:

    /**
     * This method sorts the elements of the given number sequence in descending order.
     * @param highsToLows
     */
    public static void HighsToLows(int[] highsToLows) {

        System.out.println("9:");
        System.out.println();

        Arrays.sort(highsToLows);

        for (int i = 0; i < highsToLows.length / 2; i++) {
            int temp = highsToLows[i];
            highsToLows[i] = highsToLows[highsToLows.length - 1 - i];
            highsToLows[highsToLows.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(highsToLows));
        System.out.println();
    }

    // 10. Դասավորել տրված ամբողջ թվերի հաջորդականության անդամներն անյպես, որ վերջում լինեն կենտերը:

    /**
     * This method sorts the given numbers the way, that the even numbers are located at the end.
     * @param oddsAtTheEnd
     */
    public static void OddsAtTheEnd(int[] oddsAtTheEnd) {

        System.out.println("10:");
        System.out.println();

        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for (int num : oddsAtTheEnd) {
            if (num % 2 == 0) {
                evens.add(num);
            }
            else {
                odds.add(num);
            }
        }
        evens.addAll(odds);
        System.out.println(evens);
        System.out.println();
    }

    // 11. Տրված իրական թվերի հաջորդականությունից հեռացնել բոլոր զրոները։

    /**
     * This method removes the zeros from the given array.
     * @param removeZeros
     */
    public static void RemoveZeros(int[] removeZeros) {

        System.out.println("11:");
        System.out.println();

        List<Integer> result = new ArrayList<>();

        for (int i : removeZeros) {
            if (i != 0) {
                result.add(i);
            }
        }
        System.out.println(result);
        System.out.println();
    }

    // 12. Տպել տրված թվերի հաջորդականության ամենաերկար աճող ենթահաջորդականությունը:

    /**
     * This method prints the longest increasing subsequence of the given sequence of numbers.
     * @param numbers
     */
    public static void LongestIncreasingSubsequence(int[] numbers) {

        System.out.println("12:");
        System.out.println();

        int n = numbers.length;
        int[] dp = new int[n];
        int[] prev = new int[n];

        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        int maxLen = 2;
        int lastIndex = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] < numbers[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                lastIndex = i;
            }
        }

        List<Integer> lis = new ArrayList<>();
        while (lastIndex != -1) {
            lis.add(0, numbers[lastIndex]);
            lastIndex = prev[lastIndex];
        }

        System.out.println(lis);
        System.out.println();

    }

    // 13. Ներածել n բնական թիվը 2-ական տեսքով՝ ստանալով 0-ներից ու 1-երից կազմված զանգված և արտածել n  թվի 10-ական ներկայացումը:

    /**
     * Converts a binary number into its decimal equivalent.
     * The binary digits are stored in an array, then processed to compute the decimal value.
     */
    public static void zeroOnes() {

        System.out.println("13:");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter binary digits: ");
        String binaryString = scanner.nextLine();

        int[] binaryArray = new int[binaryString.length()];
        for (int i = 0; i < binaryString.length(); i++) {
            binaryArray[i] = binaryString.charAt(i) - '0';
        }

        int decimal = 0;
        for (int i = 0; i < binaryArray.length; i++) {
            decimal = decimal * 2 + binaryArray[i];
        }

        System.out.println("Decimal value: " + decimal);
        System.out.println();

    }

    // 14. Տպել տրված մատրիցի գլխավորա անկյունագծից վերև բոլոր տարերը:

    /**
     * This method print all elements above the main diagonal of the given matrix.
     * @param matrix
     */
    public static void aboveMainDiagonal(int[][] matrix) {

        System.out.println("14:");
        System.out.println();

        int n = matrix.length;

        for (int i = 0; i < n; i ++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println(matrix[i][j] + " ");
            }
        }
        System.out.println();

    }

    // 15. Շրջել տրված ամբողջ թվերի քառակուսային մատրիցը գլխավոր անկյունագծի նկատմամբ:

    /**
     * This method rotates the given square matrix of integers about the main diagonal.
     * @param matrix
     */
    public static void transposeMatrix(int[][] matrix) {

        System.out.println("15:");
        System.out.println();

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                System.out.println(matrix[j][i] + " ");
            }
        }
        System.out.println();
    }

    /**
     * This method prints the matrix.
     */
    public static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 16. Տրված բնական թվերի քառակուսային մատրիցի համար արտածել YES, եթե նրա բոլոր տողերի տարրերի գումարը զույգ է։  NO հակառակ դեպքում։

    /**
     * This method checks if the sum of elements in each row of the given matrix is even.
     * Prints "YES" if all row sums are even, if not, prints "NO".
     * @param matrixA
     */
    public static void checkEvenRowSums(int[][] matrixA) {

        System.out.println("16:");
        System.out.println();

        int n = matrixA.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < matrixA[i].length; j++) {
                sum += matrixA[i][j];
            }
            if (sum % 2 != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }


}
