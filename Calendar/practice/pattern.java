package Calendar.practice;

public class pattern {
    public static void main(String[] args) {
        // for(int i=1; i<=30; i++){
        //     if(i % 10 ==1){
        //         System.out.println();
        //     }
        //     System.out.print(String.format("%2d",i) + " ");
        // }
        for(int i=1 ; i <= 30 ; i++){
            if(i%7 == 1){
                System.out.println();
            }
            System.out.print(String.format("%2d" , i) + " ");
        }
    }
}
