package homework7;

import jdk.jshell.execution.LoaderDelegate;

import java.time.*;
import java.time.chrono.ChronoLocalDate;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class time {
    public static void main(String[] args) {

        // 1. Use LocalDate.now() to print today’s date.
        System.out.println("1.");
        System.out.println(LocalDate.now());

        // 2. Parse the string "2025-12-31" into a LocalDate object and print it.
        System.out.println(parse("2025-12-31"));

        // 3. Given your birthdate as a string (e.g., "2000-06-15"), calculate and print your age in years using Period.between(...)
        System.out.println(age("2000-06-15"));

        // 4. Input  a date and add 100 days to it. Print the new date.
        System.out.println(addDays(LocalDate.now()));

        // 5. Use LocalTime.now() to display the current system time.
        System.out.println("\n5.");
        System.out.println(LocalTime.now());

        // 6, Print the current time in Tokyo, New York, and Yerevan using ZonedDateTime.now(ZoneId.of(...))
        System.out.println("\n6.");
        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Tokyo")));
        System.out.println(ZonedDateTime.now(ZoneId.of("America/New_York")));
        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Yerevan")));

        // 7. You have a meeting at 2025-07-26T14:00 in Yerevan. Convert this time to London and Los Angeles time using ZonedDateTime.

        System.out.println("\n7.");
        ZonedDateTime meetingTime = ZonedDateTime.of(2025, 7, 26, 14, 0, 0, 0, ZoneId.of("Asia/Yerevan"));
        System.out.println(timeConverting(meetingTime, "Europe/London"));
        System.out.println(timeConverting(meetingTime, "America/Los_Angeles"));

        // 8. Given two LocalTime values (e.g., 08:00 and 15:45), calculate the time difference using Duration.between().

        System.out.println("\n8.");
        LocalTime one = LocalTime.of(0, 0);
        LocalTime two = LocalTime.of(15, 45);
        Duration duration = Duration.between(one, two);
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        System.out.println(hours + " hours" + ", " + minutes + " minutes");

        // 9. Ask the user to enter a date and tell whether it’s a Saturday or Sunday using getDayOfWeek().
        System.out.println("\n9.");
        System.out.println(checking());

        // 10. Print all available time zone IDs using ZoneId.getAvailableZoneIds().
        System.out.println("\n10.");
        System.out.println(String.join("\n", availableTimeZones()));

    }

    // 2. Parse the string "2025-12-31" into a LocalDate object and print it.

    public static LocalDate parse(String stringParse) {

        System.out.println("\n2.");
        return LocalDate.parse(stringParse);

    }

    // 3. Given your birthdate as a string (e.g., "2000-06-15"), calculate and print your age in years using Period.between(...)

    public static int age(String birthday) {

        System.out.println("\n3.");

        LocalDate birthdate = LocalDate.parse(birthday);
        LocalDate now = LocalDate.now();

        return Period.between(birthdate, now).getYears();

    }

    // 4. Input a date and add 100 days to it. Print the new date.

    public static LocalDate addDays(LocalDate date) {

        System.out.println("\n4.");
        return date.plusDays(100);

    }

    // 7. You have a meeting at 2025-07-26T14:00 in Yerevan. Convert this time to London and Los Angeles time using ZonedDateTime.

    public static ZonedDateTime timeConverting(ZonedDateTime meeting, String zoneID) {

        return meeting.withZoneSameInstant(ZoneId.of(zoneID));

    }

    // 9. Ask the user to enter a date and tell whether it’s a Saturday or Sunday using getDayOfWeek().

    public static String checking() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date (YYYY-MM-DD): ");
        String input = scanner.nextLine();

        LocalDate date  = LocalDate.parse(input);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            return dayOfWeek + " is a weekend";
        }
        else {
            return dayOfWeek + " is NOT a weekend";
        }

    }

    // 10. Print all available time zone IDs using ZoneId.getAvailableZoneIds().

    public static String[] availableTimeZones() {

        return ZoneId.getAvailableZoneIds().toArray(new String[0]);

    }


}
