
<<<<<<< HEAD
public class Administrador extends Usuario {

    private String rol;

    public Administrador(String nombre, String correo, String contraseña, String rol) {
        super(nombre, correo, contraseña);
=======
public class Administrador {

    private String nombre;
    private String correo;
    private String rol;

    public Administrador(String nombre, String correo, String rol) {
        this.nombre = nombre;
        this.correo = correo;
>>>>>>> dd128293c2236e3edecf05e7b784832ba2edbce9
        this.rol = rol;
    }

    public void crearUsuario() {
<<<<<<< HEAD
    }

    public void eliminarUsuario() {
    }

    public void verReportes() {
=======
        
    }

    public void eliminarUsuario() {
      
    }

    public void verReportes() {
        
>>>>>>> dd128293c2236e3edecf05e7b784832ba2edbce9
    }
}