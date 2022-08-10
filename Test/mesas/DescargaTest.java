package mesas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescargaTest {
    @Test
    public void downloaderTest(){
        Usuario usuario = new Usuario("cosme", "Premium");
        Descarga descarga = new ServicioDescargaProxy();
        String espectativa = "Se le permite la descarga del contenido.";
        String realidad = descarga.descargar(usuario);
        assertEquals(espectativa,realidad);
    }

}