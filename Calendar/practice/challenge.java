package Calendar.practice;
import java.util.Scanner;
import java.time.LocalDate;

public class challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of weekday");
        int inp = sc.nextInt();
        String space = " ".repeat(inp * 2);
        System.out.println( space + "1");
    }
}

// for(int i=1 ; i<=7 ; i++){
//     if(i%7 == 1){
//         System.out.println();
//     }
//     System.out.print();
// }