package consultoria;

import java.util.GregorianCalendar;

public class ConsultorSenior extends Consultor {

    protected double complemento;
    protected int supervisados;


    public ConsultorSenior(String dni, String nombre, String apellido, double sueldo, GregorianCalendar fechaContratacion, double complemento, int supervisados, String area) {
        super(dni, nombre, apellido, sueldo, fechaContratacion, area);

        this.complemento = complemento;
        this.supervisados = supervisados;

    }

    public int getSupervisados() {
        return supervisados;
    }

    public void setSupervisados(int supervisados) {
        this.supervisados = supervisados;
    }

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

    public void añadirSupervisado() {

        if (supervisados >= 5) {

            throw new RuntimeException("No puede haber más de cinco supervisados ");

        }

        supervisados++;


    }

    public void eliminarSupervisado() {

        if (supervisados == 0) {

            throw new RuntimeException("No se puede eliminar porque no hay supervisados");

        }
        supervisados--;

    }


    @Override
    public double getSueldo(){

        int prima = 100;

        return (sueldo + (prima * supervisados) + complemento);


    }

}
