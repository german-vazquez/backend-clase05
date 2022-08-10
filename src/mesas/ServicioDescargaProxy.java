package mesas;

public class ServicioDescargaProxy implements Descarga {

    private ServicioDescarga centroDeDescargas;

    public ServicioDescargaProxy() {
        this.centroDeDescargas = new ServicioDescarga();
    }

    public ServicioDescarga getCentroDeDescargas() {
        return centroDeDescargas;
    }

    public void setCentroDeDescargas(ServicioDescarga centroDeDescargas) {
        this.centroDeDescargas = centroDeDescargas;
    }

    @Override
    public String descargar(Usuario usuario) {
        if (usuario.getTipoUsuario().equals("Premium")){
            return centroDeDescargas.descargar(usuario);
        } else {
            return "No tiene permitido uso offline. Su cuenta es Free";
        }
    }
}
