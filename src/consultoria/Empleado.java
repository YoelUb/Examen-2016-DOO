package consultoria;

import java.util.GregorianCalendar;

public class Empleado {

    protected String dni;
    protected String nombre;
    protected String apellido;
    protected double sueldo;
    protected GregorianCalendar fechaContratacion;

    // Consrtuctor
    public Empleado(String dni, String nombre, String apellido, double sueldo, GregorianCalendar fechaContratacion) {

        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.fechaContratacion = fechaContratacion;

    }

    //Getters and Setters


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public GregorianCalendar getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(GregorianCalendar fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {


        return String.format("DNI: " + dni + "\nNombre de empleado: " + nombre + "\nApellido: " + apellido + "\nSueldo: " + sueldo + " €" + "\nFecha de Contratacacion: " + fechaContratacion.getTime() + "\n----------------------------------------------------------");

    }


}

