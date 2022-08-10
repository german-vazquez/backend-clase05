package mesas;

public class ServicioDescarga implements Descarga{
    @Override
    public String descargar(Usuario usuario) {
        System.out.println("Usuario Premium!");
        return "Se le permite la descarga del contenido.";
    }
}
