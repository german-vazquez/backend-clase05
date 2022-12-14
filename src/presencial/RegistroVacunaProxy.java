package presencial;

import java.time.LocalDate;

public class RegistroVacunaProxy implements Registro {
    private RegistroVacuna centroDeVacunacion;

    //alternativa A
    public RegistroVacunaProxy() {
        this.centroDeVacunacion = new RegistroVacuna();
    }

    public RegistroVacuna getCentroDeVacunacion() {
        return centroDeVacunacion;
    }

    public void setCentroDeVacunacion(RegistroVacuna centroDeVacunacion) {
        this.centroDeVacunacion = centroDeVacunacion;
    }

    @Override
    public String vacunar(Persona persona) {
        if (persona.getFechaAsignada().isBefore(LocalDate.now())||LocalDate.now().isEqual(persona.getFechaAsignada())) {
            //alternativa B
            //centroDeVacunaci√≥n = new RegistroVacuna()

            return centroDeVacunacion.vacunar(persona);
        } else {
            return "no es su turno, vuelva cuando sea correspondiente";
        }
    }
}
