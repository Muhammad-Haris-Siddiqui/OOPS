import java.util.HashMap;

public class mode {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,5,7,2,8};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i,0)+ 1 );
        }
        int modes = arr[0];
        int maxcount = 0;
        for(int key : map.keySet()) {
            if(map.get(key) > maxcount){
                maxcount = map.get(key);
                modes = key;
            }
        }
        System.out.println("Mode = " + modes);
    }
}
