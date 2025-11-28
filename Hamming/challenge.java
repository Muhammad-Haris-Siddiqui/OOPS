import java.util.Scanner;

public class challenge{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter any number");
        // int a = sc.nextInt();

        // System.out.println("Enter the position of bit you want to know");
        // int b = sc.nextInt();
        // int y = (b-1) & b;
        int a = 100;
        int m = 1;
        m = m << 31;
        String bt = "";
        for(int i=0 ; i<32 ; i++){
            int y = a & m;
            if (y == 0){
                System.out.print("0");
                // bt = "0"+ bt ;
            }else{
                System.out.print("1");
                // bt = "1"+ bt ;
            }
            m = m >>> 1;
        }
        // System.out.print(bt);
    }
}