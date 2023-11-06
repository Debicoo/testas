import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class metodas1 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        List<LocalDate> dateArray = new ArrayList<>();
        dateArray.add(today);
        for (int i = 1; i < 8511; i++) {
            today = today.plusDays(5);
            dateArray.add(today);
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
        DateTimeFormatter formatterm = DateTimeFormatter.ofPattern("MM");

        for (LocalDate date : dateArray) {
            String formattedDay = date.format(formatter);
            String formattedMonth = date.format(formatterm);
            int numeris = Integer.parseInt(formattedMonth);
            int numeris1 = Integer.parseInt(formattedDay);
            System.out.println(numeris1 - numeris + 20);
        }
    }
}
