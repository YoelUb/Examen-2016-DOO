package consultoria;

import javax.management.remote.SubjectDelegationPermission;
import java.util.GregorianCalendar;

public class ConsultorJunior extends Consultor {


    protected ConsultorSenior supervisor;
    protected boolean ascenso;


    public ConsultorJunior(String dni, String nombre, String apellido, double sueldo, GregorianCalendar fechaContratacion, ConsultorSenior supervisor, String area) {
        super(dni, nombre, apellido, sueldo, fechaContratacion, area);

        this.supervisor = supervisor;
        this.ascenso = false;

    }


    public ConsultorSenior getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(ConsultorSenior supervisor) {
        this.supervisor = supervisor;
    }

    public boolean isAscenso() {
        return ascenso;
    }

    public void setAscenso(boolean ascenso) {
        this.ascenso = ascenso;
    }


    public void cambiarSupervisor(ConsultorSenior nuevoSupervisor) {

        if (this.supervisor != null) {

            this.supervisor.eliminarSupervisado();
        }

        this.supervisor = nuevoSupervisor;


        if (supervisor != null) {

            supervisor.añadirSupervisado();
        }


    }


}
