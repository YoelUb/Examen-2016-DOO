package consultoria;

import java.util.ArrayList;

public class Consultora {

    protected ArrayList<Empleado> empleados;
    protected int tamaño;

    public Consultora() {

        this.empleados = new ArrayList<>(tamaño);
        this.tamaño = 10;

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


            if(empleado.get)

        }


    }


}
