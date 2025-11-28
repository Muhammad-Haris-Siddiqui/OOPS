package Calendar.practice;

import java.time.LocalDate;

public class Localdate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate someDate = LocalDate.of(2025, 8, 4);
        System.out.println(someDate);

        // LocalDate date = LocalDate.now();
        // System.out.println(date);
    }
}
