package HashMap;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String , String> janwar = new HashMap<>();
        janwar.put("Suar", "Abdullah");
        janwar.put("Kutta", "Zain");
        janwar.put("Chinal", "Mubashir");

        System.out.println(janwar.get("Chinal"));

        HashMap<String, String> pagal = new HashMap<>();
        pagal.put("Abdullah", "bkc");
        pagal.put("Farooqui", "bkl");
        pagal.put("Mubashir", "rkb");

        System.out.println(pagal.get("Farooqui"));
    }
}