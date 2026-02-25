public class ProveedorExterno implements IProveedorAutenticacion {

    private String nombre;
    private String url;
    private boolean disponible;

    public ProveedorExterno(String nombre, String url, boolean disponible) {
        this.nombre = nombre;
        this.url = url;
        this.disponible = disponible;
    }

    @Override
    public void autenticar() {
    }

    public void conectar() {
    }

    public void desconectar() {
    }
}