
public class Administrador extends Usuario {

    private String rol;

    public Administrador(String nombre, String correo, String contraseña, String rol) {
        super(nombre, correo, contraseña);
        this.rol = rol;
    }

    public void crearUsuario() {
    }

    public void eliminarUsuario() {
    }

    public void verReportes() {
    }
}