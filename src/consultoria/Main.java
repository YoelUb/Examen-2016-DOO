package consultoria;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        GregorianCalendar gc = new GregorianCalendar(2023, Calendar.JANUARY, 12);
        Empleado yoel = new Empleado("123456789A", "Yoel", "Urquijo", 2000, gc);
        Directivo marta = new Directivo("123456749A", "Marta", "Rodriguez", 2000, gc, "Directiva");
        System.out.println("\n----------------------------------------------------------");
        System.out.println(yoel);
        System.out.println(marta);


    }
}