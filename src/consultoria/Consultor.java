package consultoria;

import java.util.GregorianCalendar;

public class Consultor extends Empleado {

    protected String area;


    public Consultor(String dni, String nombre, String apellido, double sueldo, GregorianCalendar fechaContratacion, String area) {
        super(dni, nombre, apellido, sueldo, fechaContratacion);

        this.area = area;

    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

}
