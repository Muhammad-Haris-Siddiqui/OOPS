package Calendar.practice;

import java.util.Scanner;
import java.time.LocalDate;

public class day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of day");
        int day = sc.nextInt();
        System.out.println("Enter the number of month");
        int month = sc.nextInt();
        System.out.println("Enter the number of year");
        int year = sc.nextInt();

        LocalDate date = LocalDate.of(year,month,day);
        System.out.println(date.getDayOfWeek());
    }
}
