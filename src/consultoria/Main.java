package consultoria;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        GregorianCalendar gc = new GregorianCalendar(2023, Calendar.JANUARY, 12);
        Consultora consultora = new Consultora();
        ConsultorSenior marcos = new ConsultorSenior("3", "marcos", "senior", 1000, gc, 100, 5, "Tecnologia");
        ConsultorJunior pepe = new ConsultorJunior("4", "Pepe", "junior", 800, gc, marcos, "Tecnologia");
        Directivo directivo1 = new Directivo("1", "Luis", "Martinez", 5000, gc, "economia");
        Directivo directivo2 = new Directivo("2", "Ana", "Sanchez", 5500, gc, "mates");
        Empleado maria = new Empleado("2", "maria", "maria", 1000, gc);


        consultora.añadirEmpleado(pepe);
        consultora.añadirEmpleado(maria);
        consultora.añadirEmpleado(marcos);
        consultora.añadirEmpleado(directivo1);
        consultora.añadirEmpleado(directivo2);


        System.out.println("Sueldo total: " + consultora.sueldoTotal());
        System.out.println("El empleado buscado: " + consultora.buscarEmpleado(String.valueOf(1)));
        System.out.println("Numero de Consultores Senior: " + consultora.numeroSenior());
        consultora.imprimirSupervisados();
        System.out.println("Directivo mas antiguo: " + consultora.directivoMasAntiguo());
        System.out.println("Suma total del area: " + consultora.area("Tecnologia"));

    }


}