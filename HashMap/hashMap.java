package HashMap;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String , String> janwar = new HashMap<>();
        janwar.put("Suar", "Abdullah");
        janwar.put("Kutta", "Zain");
        janwar.put("Chinal", "Mubashir");

        System.out.println(janwar.get("Chinal"));
    }
}