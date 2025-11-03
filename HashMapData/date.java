package HashMapData;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class date {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2025,11,9);
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String sd1 = d1.format(df1);
        System.out.println(sd1);
    }
}
