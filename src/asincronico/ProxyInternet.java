package asincronico;

import java.util.List;

public class ProxyInternet implements IConexionInternet {
    private InternetService internetService;
    private List<String> sitiosBloqueados;

    public ProxyInternet(List<String> sitiosBloqueados, InternetService internetService) {
        this.sitiosBloqueados = sitiosBloqueados;
        this.internetService = internetService;
    }

    @Override
    public void conectarCon(String url) {
        if(this.sitiosBloqueados.contains(url)){
            System.out.println("Acceso denegado");
        }else {
            this.internetService.conectarCon(url);
        }
    }
}
