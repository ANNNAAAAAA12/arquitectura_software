<<<<<<< HEAD
public class ProveedorExterno implements IProveedorAutenticacion {
=======
public class ProveedorExterno {
>>>>>>> dd128293c2236e3edecf05e7b784832ba2edbce9

    private String nombre;
    private String url;
    private boolean disponible;

    public ProveedorExterno(String nombre, String url, boolean disponible) {
        this.nombre = nombre;
        this.url = url;
        this.disponible = disponible;
    }

<<<<<<< HEAD
    @Override
    public void autenticar() {
    }

    public void conectar() {
    }

    public void desconectar() {
=======
    public void autenticar() {
        
    }

    public void conectar() {
    
    }

    public void desconectar() {
        
>>>>>>> dd128293c2236e3edecf05e7b784832ba2edbce9
    }
}