package consultoria;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        GregorianCalendar gc = new GregorianCalendar(2023, Calendar.JANUARY, 12);
        Consultora consultora = new Consultora();
        Empleado pepe = new Empleado("1", "pepe", "pepe", 1000, gc);
        Empleado maria = new Empleado("2", "maria", "maria", 1000, gc);


        consultora.añadirEmpleado(pepe);
        consultora.añadirEmpleado(maria);

        System.out.println("Sueldo total: " + consultora.sueldoTotal());

    }
}