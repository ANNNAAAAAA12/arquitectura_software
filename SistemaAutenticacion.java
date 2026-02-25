public class SistemaAutenticacion {

    private String nombreSistema;
    private int totalUsuarios;
    private boolean activo;

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
    }
}