package homework5;

public class StringUtil {
    public static void main(String[] args) {

        StringUtil obj = new StringUtil();
        System.out.println(obj.hw()); // 1.1
        System.out.println(obj.h12()); // 1.2
        System.out.println(obj.h1h2()); // 1.3
        System.out.println(obj.h12w()); // 1.4
        obj.weAreLivingIn("We Are Living In"); // 2
        System.out.println(obj.reversing("Letting")); // 3
        System.out.println(obj.checkToken("We are living in a yellow submarine. We don't  have anything", "in")); // 4
        System.out.println(obj.upperDigit("hello")); // 5
        System.out.println(obj.upperDigitBuilder("hello")); // 5.1
        System.out.println(obj.fillTill20("Madness")); // 6
        System.out.println(obj.deleteA("We are living in a yellow submarine. We don't have anything.")); // 7
        System.out.println(obj.deleteBuilderA("We are living in a yellow submarine. We don't have anything.")); // 7.1
        System.out.println(obj.replaceA("We are living in a yellow submarine. We don't  have anything.")); // 8
        System.out.println(obj.longestWord("We are living in a yellow submarine. We don't  have anything")); // 9
        System.out.println(obj.whereC("We are living in a yellow submarine. We don't  have anything.")); // 10
        System.out.println(obj.stopAtN("We are living in a yellow submarine. We don't  have anything.", 9)); // 11
        System.out.println(obj.stopBuilderAtN("We are living in a yellow submarine. We don't  have anything.", 16)); // 11.1
        System.out.println(obj.checkIfNull("")); // 12
        System.out.println(obj.checkIfNull2("aa")); // 12.1
        System.out.println(obj.theLongest("We, are, living, in an, yellow, submarine, We don't,  have anything")); // 13


    }

    // 1. Գրել method,  որը  կատարում է String concatenation  տվյալ պարամետրով․

    /**
     * Combines two given strings.
     *  “hello” , “world”
     * @return Combines
     */
    public String hw() {
        return "hello" + " " + "world";
    }

    /**
     * Combines the given numbers and the string.
     * 1 , 2 , “hello”
     * @return Combines
     */
    public String h12() {
        return 1 + 2 + "hello";
    }

    /**
     * Combines the given number and strings.
     * “1” , 2 , “hello”
     * @return Combines
     */
    public String h1h2() {
        return "1" + 2 + "hello";
    }

    /**
     * Combines the given numbers and strings.
     * “hello”, 1 ,2, “world”
     * @return
     */
    public String h12w() {
        return "hello" + 1 + 2 + "world";
    }

    // 2. Գրել method,  որը  ստանում է String պարամետր և տպում է ամեն դատարկ  սիվոլից նոր տողում օգտագործելով  String Literal ( \t, \b ….)․

    /**
     * This method print in a new line every time it sees an empty symbol.
     * @param st
     */
    public void weAreLivingIn(String st) {
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if (ch == ' ') {
                System.out.println("\n");
            }
            else {
                System.out.println(ch);
            }
        }
    }

    // 3. Գրել method (reverse), որը  շուռ է տալիս String.

    /**
     * This method reverses the given string.
     * @param string
     * @return Returns the string from back to front
     */
    public String reversing(String string) {
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }

    // 4. Գրել method, որը ստուգում է թե քանի անգամ է տրված տեքստում հանդիպել token ենթատողը.

    /**
     * Checks how many times is the given token featuring in the String.
     * @param line
     * @param token
     * @return Gives out the number.
     */
    public int checkToken(String line, String token) {
        int index = 0;
        int count = 0;

        while((index = line.indexOf(token, index)) != -1) {
            count++;
            index += token.length();
        }
        return count;
    }


    // 5. Գրել method, որը  տեքստը սարքում է մեծատառերով գրված, օգտագործելով String.
    //    Նույնը  խնդիրը   StringBuilder-ով.

    /**
     * This method makes the text uppercase.
     * @param word
     * @return Uppercase text
     */
    public String upperDigit(String word) {
        return word.toUpperCase();
    }

    // StringBuilder
    public String upperDigitBuilder(String word) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            sb.append(Character.toUpperCase(ch));
        }
        return sb.toString();
    }

    // 6. Գրել method, որը console-ից կարդում է 20 երկարությամբ սիմվոլների տող , տպում այն եթե տողի
    // երկարությունը պակաս է 20 ից ապա պետք է տողը լռացնենք պակաս սիմվոլների փոխարեն գրելով «*» սիմվոլը.

    /**
     * This method fills the empty space with * in a 20 digit line.
     * @param line
     * @return Fills the emptiness
     */
    public String fillTill20(String line) {
        StringBuilder sb = new StringBuilder();

        sb.append(line);

        while (sb.length() < 20) {
            sb.append("*");
        }
        return sb.toString();
    }

    // 7. Գրել method, որը տրված տեքստից հեռացնում է բոլոր « a »  սիմվոլները. Նույնը խնդիրը  StringBuilder-ով.

    /**
     * This method removes all the "a" digits from the given line.
     * @param line
     * @return Removes the digits
     */
    public String deleteA(String line) {
        return line.replace("a", "");
    }

    // StringBuilder
    public String deleteBuilderA(String line) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch != 'a') {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    // 8. Գրել method, որը տրված տեքստում բոլոր « a »  սիմվոլները փոխարինում է « * » , օգտագործելով String.

    /**
     * This method replaces all the "a" digits with "*" symbol.
     * @param line
     * @return Does the replacement
     */
    public String replaceA(String line) {
        return line.replace("a", "*");
    }

    // 9.  Գրել method, որը գտնում է տեքստում ամենաերկար բառը, տեքստում բառերը անջատված են իրարից պռոբելով.

    /**
     * This method gives out the longest word in the given line.
     * @param line
     * @return Prints the longest word.
     */
    public String longestWord(String line) {
        String[] words = line.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    // 10. Գրել method, որը գտնում է թե, որերորդ ինդեքսում է առաջին անգամ հանդիպել String c  սիմվոլը.

    /**
     * This method finds and gives out the index of "a" digit.
     * @param line
     * @return Gives out the index
     */
    public int whereC(String line) {
        String c = "a";
        return line.indexOf(c);
    }

    // 11. Գրել method, որը գտնում և տպում է տրված տողի սկզբից մինչև n-րդ ինդեքսը
    //     պարունակող ենթատողը, օգտագործելով String. Նույնը խնդիրը  StringBuilder-ով.

    /**
     * This method prints the line until the "n" index.
     * @param line
     * @param n
     * @return Gives the modified line
     */
    public String stopAtN(String line, int n) {
        if (n > line.length()) return line;
        return line.substring(0, n);
    }

    public String stopBuilderAtN(String line, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line.length() && i < n; i++) {
            sb.append(line.charAt(i));
        }
        return sb.toString();
    }

    // 12.  Գրել method, որը ստուգում է թե արդյոք  տրված  String պարամետրը  դատարկ և null չէ․

    /**
     * This method checks if the String parameter is empty/null.
     * @param line
     * @return Checks it
     */
    public String checkIfNull(String line) {
        if (!line.isEmpty()) {
            return "Is not empty/null";
        }
        else {
            return "Is empty/null";
        }
    }

    // here's another way

    /**
     * @param line
     * @return {@code false} It's empty/null {@code true} It's not empty/null
     */
    public boolean checkIfNull2(String line) {
        return !line.isEmpty() && line != null;
    }

    // 13. Գրել method, որը տրոհում է նախադսությունը ըստ  ‘,’   և գտում ամեներկար բառը

    /**
     * This method gives out the longest word from the line.
     * @param line
     * @return Gives out the word
     */
    public String theLongest(String line) {
        String[] words = line.split(",");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}
