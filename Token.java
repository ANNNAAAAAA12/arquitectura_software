<<<<<<< HEAD
public class Token implements IAutenticable {
=======
public class Token {
>>>>>>> dd128293c2236e3edecf05e7b784832ba2edbce9

    private String valor;
    private String tipo;
    private String fechaExpiracion;

    public Token(String valor, String tipo, String fechaExpiracion) {
        this.valor = valor;
        this.tipo = tipo;
        this.fechaExpiracion = fechaExpiracion;
    }

    public void generar() {
    }

<<<<<<< HEAD
    @Override
    public void validar() {
    }

    public void renovar() {
=======
    public void validar() {
    
    }

    public void renovar() {
        
>>>>>>> dd128293c2236e3edecf05e7b784832ba2edbce9
    }
}