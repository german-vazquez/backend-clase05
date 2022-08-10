package presencial;

public class RegistroVacuna implements Registro{
    @Override
    public String vacunar(Persona persona) {
        // se puede aplicar la vacuna sin problemas
        System.out.println("se aplicó la vacuna");
        return "se ha registrado el DNI "+persona.getDNI()+" como paciente vacunado con la "+persona.getNombreVacuna();
    }
}
