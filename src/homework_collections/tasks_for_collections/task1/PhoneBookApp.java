package homework_collections.tasks_for_collections.task1;

import java.util.*;

public class PhoneBookApp {
    private static boolean numCheck(String phoneNumber) {
        return phoneNumber.matches("\\d{6}");
    }

    private static boolean charCheck(String character) {
        return character.length() >= 3;
    }

    private static final Map<String, List<String>> phoneBook = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("\n1) Add 2) Delete 3) Search 4) List 5) Exit");
            System.out.println("Choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println(" ---- Invalid input, ape ---- ");
                scanner.nextLine();
                continue;
            }

            if (choice == 5) {
                System.out.println(" ---- BYE APE ---- ");
                break;
            }

            switch (choice) {
                case 1: addContact(); break;
                case 2: deleteContact(); break;
                case 3: searchForContact(); break;
                case 4: contactList(); break;
                default:
                    System.out.println(" ---- Nah, that's not a valid option, ape ---- ");
                    break;
            }
        }
    }

    private static void addContact() {
        System.out.println("Name: ");
        String name = scanner.nextLine().trim();

        if (!charCheck(name)) {
            System.out.println(" ---- Invalid format, ape. The name must contain at least 3 characters ---- ");
        }
        else {
            System.out.println("Number: ");
            String number = scanner.nextLine().trim();

            if (numCheck(number)) {
                List<String> existingNumbers = phoneBook.computeIfAbsent(name, k -> new ArrayList<>());;

                if (existingNumbers.contains(number)) {
                    System.out.println(" ---- This number already exists ---- ");
                } else {
                    existingNumbers.add(number);
                    System.out.println(" ---- " + name + " is added to your contact list ---- ");
                }
            } else {
                System.out.println(" ---- Invalid format, ape. The number must be 6 digits ---- ");
            }
        }
    }

    private static void deleteContact() {
        System.out.println("Name: ");
        String name = scanner.nextLine().trim();
        if (phoneBook.remove(name) != null) {
            System.out.println(" ---- " + name + " is now deleted from your contact list ---- ");
        } else {
            System.out.println(" ---- " + name + " is not in your contact list ---- ");
        }
    }

    private static void searchForContact() {
        System.out.println("Search by: ");
        String searchBy = scanner.nextLine().trim();
        boolean found = false;

        if (charCheck(searchBy)) {
            for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
                String name = entry.getKey();
                if (name.toLowerCase().contains(searchBy)) {
                    System.out.println(name + ": " + entry.getValue());
                    found = true;
                }
            }
            if (!found) {
                System.out.println(" ---- No contact found ---- ");
            }
        } else {
            System.out.println(" ---- Please, enter at least 3 characters ---- ");
        }
    }

    private static void contactList() {
        Set<String> sortedNames = new TreeSet<>(phoneBook.keySet());
        System.out.println("\n ---- Contact List ---- ");
        if (!phoneBook.isEmpty()) {
            for (String name : sortedNames) {
                System.out.println(name + ", " + phoneBook.get(name));
            }
        } else {
            // Ynker Aren stex internetic italic font em copy paste arel
            System.out.println("\uD835\uDE1B\uD835\uDE29\uD835\uDE26 \uD835\uDE31\uD835\uDE29\uD835\uDE30\uD835\uDE2F\uD835\uDE26 \uD835\uDE23\uD835\uDE30\uD835\uDE30\uD835\uDE2C \uD835\uDE2A\uD835\uDE34 \uD835\uDE26\uD835\uDE2E\uD835\uDE31\uD835\uDE35\uD835\uDE3A, \uD835\uDE22\uD835\uDE31\uD835\uDE26. \uD835\uDE1B\uD835\uDE30 \uD835\uDE22\uD835\uDE25\uD835\uDE25 \uD835\uDE22 \uD835\uDE2F\uD835\uDE26\uD835\uDE38 \uD835\uDE24\uD835\uDE30\uD835\uDE2F\uD835\uDE35\uD835\uDE22\uD835\uDE24\uD835\uDE35 \uD835\uDE34\uD835\uDE26\uD835\uDE2D\uD835\uDE26\uD835\uDE24\uD835\uDE35 [1) \uD835\uDE08\uD835\uDE25\uD835\uDE25]");
        }
        System.out.println("-------------------------");
    }
}
