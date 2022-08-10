package presencial;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RegistroTest {
@Test
    public void vacunarPersonaOkTest(){
    Persona persona=new Persona("cosme", "fulanito", "2280", "pfizer", LocalDate.of(2022,6, 22));
    Registro registro = new RegistroVacunaProxy();

}
}