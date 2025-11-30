package Calendar.practice;

import java.util.Scanner;
import java.time.LocalDate;

public class calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of day");
        int day = sc.nextInt();
        System.out.println("Enter the number of month");
        int month = sc.nextInt();
        System.out.println("Enter the number of year");
        int year = sc.nextInt();
        LocalDate date = LocalDate.of(year, month, 1);
        int weekday = date.getDayOfWeek().getValue();
        
        int totalDays =  date.lengthOfMonth();

        String space = "   ".repeat(weekday - 1);
        System.out.println("Mo Tu WE Th FR SA SU");
        System.out.print(space);


        for(int i = 1 ; i <= totalDays ; i++ ){
            if(weekday%7 == 1){
                System.out.println("");
            }else{
                System.out.print( String.format("%2d", i) + " ");
                weekday++;
            }
        }
    }
}
