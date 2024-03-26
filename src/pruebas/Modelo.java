package pruebas;

import java.util.ArrayList;
import java.util.List;

public class Modelo {
    private String mensaje;
    private List<String> palabrasProhibidas;

    public Modelo() {
        this.mensaje = "";
        this.palabrasProhibidas = new ArrayList<>();
        this.palabrasProhibidas.add("hola");
        this.palabrasProhibidas.add("mundo");
        // Agrega más palabras prohibidas según lo necesites
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public List<String> getPalabrasProhibidas() {
        return palabrasProhibidas;
    }
}
