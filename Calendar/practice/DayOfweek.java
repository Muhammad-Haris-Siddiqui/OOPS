package Calendar.practice;

import java.time.LocalDate;

public class DayOfweek {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025,8,4);

        System.out.println("Date: " + date);
        System.out.println("Day: " + date.getDayOfWeek());
        System.out.println("Day number: "+ date.getDayOfWeek().getValue());
    }
}