package Calendar.practice;
import java.util.Scanner;
import java.time.LocalDate;

public class DayInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of month");
        int month = sc.nextInt();
        System.out.println("Enter the number of year");
        int year = sc.nextInt();

        LocalDate cal = LocalDate.of(year,month,1);
        int sal = cal.lengthOfMonth();
        System.out.println(sal);

    }
}
