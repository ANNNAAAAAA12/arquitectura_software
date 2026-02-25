public interface IRepositorioUsuarios {

    void guardarUsuario(Usuario usuario);

    void eliminarUsuario(String correo);
}