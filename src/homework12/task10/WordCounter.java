package homework12.task10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter file  name: ");
        String fileName = input.nextLine();

        try {

            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            int wordCount = 0;

            while (fileScanner.hasNext()) {
                fileScanner.next();
                wordCount++;

            }

            System.out.println("Number of words in the file: " + wordCount);
            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found or cannot be opened.");
        }

        input.close();

    }
}
