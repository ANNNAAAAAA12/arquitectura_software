public class BaseDatos {

    private String nombre;
    private int cantidadRegistros;
    private boolean conectada;

    public BaseDatos(String nombre, int cantidadRegistros, boolean conectada) {
        this.nombre = nombre;
        this.cantidadRegistros = cantidadRegistros;
        this.conectada = conectada;
    }

    public void conectar() {
        
    }

    public void guardarDatos() {
        
    }

    public void cerrarConexion() {
        
    }
}