package HashMapData;
import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class RepId {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\Projects\\Java-Files\\OOPS\\sales.txt");
        Scanner input = new Scanner(file);
        HashMap<String, Integer> product = new HashMap<>();

        if (input.hasNextLine()) input.nextLine();
        int add = 0;
        while (input.hasNextLine()) {
            String[] arr = input.nextLine().split("\t");
            String name = arr[5];
            int qty = Integer.parseInt(arr[2]);
            int price = Integer.parseInt(arr[3]);
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