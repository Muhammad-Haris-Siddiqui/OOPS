package HashMapData;
import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {

        try {
            
            File file = new File("D:\\Projects\\Java-Files\\OOPS\\sales.txt");
            
            Scanner sc1 = new Scanner(file);

            HashMap<String, Integer> Products = new HashMap<>();
            
            String line = sc1.nextLine();
            while (sc1.hasNext()) {
                line = sc1.nextLine();
                
                String[] arr = line.split("\t");
                
                if(!Products.containsKey(arr[1])){
                    Products.put(arr[1], 0);
                }
                
            }

            Scanner sc2 = new Scanner(file);
            
            line = sc2.nextLine();
            while (sc2.hasNext()) {
                line = sc2.nextLine();

                String[] arr = line.split("\t");

                int sumOfL = Integer.parseInt(arr[2]) * Integer.parseInt(arr[3]);

                Products.put(arr[1], (Products.get(arr[1]) + sumOfL));

            }

            for(String pr : Products.keySet()){
                System.out.println(pr + " : " + Products.get(pr));
            }

           
          
            
        } catch (Exception e) {
            //baad mein
        }
    }
}