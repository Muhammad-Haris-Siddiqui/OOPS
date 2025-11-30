import java.util.HashMap;

public class mode2 {
    public static void main(String[] args) {
        int[] arr = {5, 5, 6, 7, 6, 6, 8, 5, 6};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int largest = arr[0];
        int max = 0;
        for (int key : map.keySet()) {
            if(map.get(key) > max){
                max = map.get(key);
                largest = key;
            }
        }
        System.out.println("Mode = " + largest);
    }
}
