public class SistemaAutenticacion {

    private String nombreSistema;
    private int totalUsuarios;
    private boolean activo;

<<<<<<< HEAD
    // Dependencias por interfaces (DIP)
    private IRepositorioUsuarios repositorio;
    private IProveedorAutenticacion proveedor;

    public SistemaAutenticacion(String nombreSistema, int totalUsuarios, boolean activo,
                                IRepositorioUsuarios repositorio,
                                IProveedorAutenticacion proveedor) {
        this.nombreSistema = nombreSistema;
        this.totalUsuarios = totalUsuarios;
        this.activo = activo;
        this.repositorio = repositorio;
        this.proveedor = proveedor;
    }

    public void registrarUsuario(Usuario usuario) {
        repositorio.guardarUsuario(usuario);
    }

    public void validarUsuario() {
        proveedor.autenticar();
    }

    public void eliminarUsuario(String correo) {
        repositorio.eliminarUsuario(correo);
=======
    public SistemaAutenticacion(String nombreSistema, int totalUsuarios, boolean activo) {
        this.nombreSistema = nombreSistema;
        this.totalUsuarios = totalUsuarios;
        this.activo = activo;
    }

    public void registrarUsuario() {
        
    }

    public void validarUsuario() {
        
    }

    public void eliminarUsuario() {
        
>>>>>>> dd128293c2236e3edecf05e7b784832ba2edbce9
    }
}