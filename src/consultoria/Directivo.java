package consultoria;

import java.util.GregorianCalendar;

public class Directivo extends Empleado {

    protected String directivo;

    // Constructor
    public Directivo(String dni, String nombre, String apellido, double sueldo, GregorianCalendar fechaContratacion, String directivo) {
        super(dni, nombre, apellido, sueldo, fechaContratacion);

        this.directivo = directivo;
    }


    // Getter and Setters
    public String getDirectivo() {
        return directivo;
    }

    public void setDirectivo(String directivo) {
        this.directivo = directivo;
    }
}
