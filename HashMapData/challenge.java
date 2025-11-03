package HashMapData;
import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class challenge {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\Projects\\Java-Files\\OOPS\\data.txt");
        Scanner input = new Scanner(file);
        HashMap<String, Integer> product = new HashMap<>();
        String[] array = input.nextLine().split("\t");
        for(int i=0 ; i<=3; i++){
            System.out.print(i + 1 + " ");
            System.out.println(array[i]);
        }
        System.out.println("Enter the number you want to sum acording");
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        int add = 0;
        while (input.hasNextLine()) {
            String[] arr = input.nextLine().split("\t");
            String name = arr[inp-1];
            int qty = Integer.parseInt(arr[4]);
            int price = Integer.parseInt(arr[5]);
            int total = qty * price;
            add = add + total;

            product.put(name, product.getOrDefault(name, 0) + total);
        }
        
        input.close();
        
        product.forEach((name, sum) -> System.out.println(name + " : " + sum));
        System.out.println("Total" + " : " + add);
    }
}
// Output : 9534