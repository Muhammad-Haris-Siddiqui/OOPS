package HashMapData;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class month {
    public static void main(String[] args)throws Exception {
        File file = new File("D:\\Projects\\Java-Files\\OOPS\\sales.txt");
        Scanner input = new Scanner(file);
        HashMap<String, Integer> product = new HashMap<>();

        if (input.hasNextLine()) input.nextLine();
        int add = 0;
        while (input.hasNextLine()) {
            String[] arr = input.nextLine().split("\t");
            // String name = arr[4];
            String[] aray = arr[4].split("/");
            String month = aray[0];
            int qty = Integer.parseInt(arr[2]);
            int price = Integer.parseInt(arr[3]);
            int total = qty * price;
            add = add + total;

            product.put(month, product.getOrDefault(month, 0) + total);
        }

        input.close();

        product.forEach((month, sum) -> System.out.println(month + " : " + sum));
        System.out.println("Total" + " : " + add);
    }
}
