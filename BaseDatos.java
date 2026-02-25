public class BaseDatos implements IRepositorioUsuarios {

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

    @Override
    public void guardarUsuario(Usuario usuario) {
    }

    @Override
    public void eliminarUsuario(String correo) {
    }

    public void cerrarConexion() {
    }
}