package HashMapData;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

public class week {
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
            int mon = Integer.parseInt(aray[0]);
            int day = Integer.parseInt(aray[1]);
            int year = Integer.parseInt(aray[2]);
            LocalDate d1 = LocalDate.of(year,mon,day);
            DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String sd1 = d1.format(df1);
            // System.out.println(sd1);
            String DOW = d1.getDayOfWeek().toString();
            // String month = aray[0];
            int qty = Integer.parseInt(arr[2]);
            int price = Integer.parseInt(arr[3]);
            int total = qty * price;
            add = add + total;

            product.put(DOW, product.getOrDefault(DOW, 0) + total);
        }

        input.close();

        product.forEach((DOW, sum) -> System.out.println(DOW + " : " + sum));
        System.out.println("Total" + " : " + add);

    }
}
// Output : 9534