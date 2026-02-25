<<<<<<< HEAD
public class Credencial implements IAutenticable {
    
    @Override
    public void validar() {
=======
public class Credencial {

    private String usuario;
    private String password;
    private boolean verificada;

    public Credencial(String usuario, String password, boolean verificada) {
        this.usuario = usuario;
        this.password = password;
        this.verificada = verificada;
    }

    public void validar() {
        
    }

    public void cambiarPassword() {
        
    }

    public void verificarCuenta() {
        
>>>>>>> dd128293c2236e3edecf05e7b784832ba2edbce9
    }
}