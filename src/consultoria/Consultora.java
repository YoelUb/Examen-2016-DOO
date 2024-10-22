package consultoria;

import java.util.ArrayList;

public class Consultora {

    protected ArrayList<Empleado> empleados;
    private int tamaño;

    public Consultora() {

        this.tamaño = 10;
        this.empleados = new ArrayList<>(tamaño);


    }

    public boolean añadirEmpleado(Empleado empleado) {

        if (empleados.size() > tamaño) {

            return false;

        }

        empleados.add(empleado);
        return true;

    }


    public double sueldoTotal() {

        double total = 0;

        for (Empleado empleado : empleados) {

            total += empleado.getSueldo();

        }

        return total;

    }


    public Empleado buscarEmpleado(String dni) {


        if (empleados.isEmpty()) {


            return null;
        }


        for (Empleado empleado : empleados) {


            if (empleado.getDni().equals(dni)) {

                return empleado;

            }

        }

        return null;

    }


    public int numeroSenior() {

        int contador = 0;

        if (empleados.isEmpty()) {


            return 0;
        }


        for (Empleado empleado : empleados) {

            if (empleado instanceof ConsultorSenior) {

                contador++;

            }

        }

        return contador;

    }


    private void imprimirSupervisados(ConsultorSenior consultor) {

        if (empleados.isEmpty()) {


            System.out.println("No hay empleados");

        }

        for (Empleado empleado : empleados) {

            if (empleado instanceof ConsultorJunior) {

                ConsultorJunior junior = (ConsultorJunior) empleado;

                if (junior.getSupervisor().equals(consultor)) {
                    System.out.println(junior);
                }
            }
        }

    }


    public void imprimirSupervisados() {

        if (empleados.isEmpty()) {


            System.out.println("No hay empleados");

        }

        for (Empleado empleado : empleados) {


            if (empleado instanceof ConsultorSenior) {

                ConsultorSenior senior = (ConsultorSenior) empleado;

                imprimirSupervisados(senior);

            }

        }


    }

    public Directivo directivoMasAntiguo() {

        Directivo directivoAntiguo = null;

        if (empleados.isEmpty()) {


            return null;

        }

        for (Empleado empleado : empleados) {

            if (empleado instanceof Directivo) {

                Directivo directivo = (Directivo) empleado;

                if (directivoAntiguo == null || directivo.getFechaContratacion().before(directivoAntiguo.getFechaContratacion())) {
                    directivoAntiguo = directivo;
                }

            }

        }

        return directivoAntiguo;


    }

    public double area(String area) {

        double sumaTotal = 0;

        if (empleados.isEmpty()) {

            return 0;
        }

        for (Empleado empleado : empleados) {

            if (empleado instanceof Consultor) {

                Consultor consultor = (Consultor) empleado;
                if (consultor.getArea().equals(area)) {


                    sumaTotal += consultor.getSueldo();


                }
            }

        }

        return sumaTotal;

    }


}
