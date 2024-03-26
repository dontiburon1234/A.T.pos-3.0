package pruebas;

public class Principal {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista, modelo);

        controlador.iniciar();
    }
}
