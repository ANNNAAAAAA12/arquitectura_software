<<<<<<< HEAD
public class BaseDatos implements IRepositorioUsuarios {
=======
public class BaseDatos {
>>>>>>> dd128293c2236e3edecf05e7b784832ba2edbce9

    private String nombre;
    private int cantidadRegistros;
    private boolean conectada;

    public BaseDatos(String nombre, int cantidadRegistros, boolean conectada) {
        this.nombre = nombre;
        this.cantidadRegistros = cantidadRegistros;
        this.conectada = conectada;
    }

    public void conectar() {
<<<<<<< HEAD
    }

    @Override
    public void guardarUsuario(Usuario usuario) {
    }

    @Override
    public void eliminarUsuario(String correo) {
    }

    public void cerrarConexion() {
=======
        
    }

    public void guardarDatos() {
        
    }

    public void cerrarConexion() {
        
>>>>>>> dd128293c2236e3edecf05e7b784832ba2edbce9
    }
}