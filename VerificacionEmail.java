
public class VerificacionEmail {

    private String correoDestino;
    private String codigo;
    private boolean enviado;

    public VerificacionEmail(String correoDestino, String codigo, boolean enviado) {
        this.correoDestino = correoDestino;
        this.codigo = codigo;
        this.enviado = enviado;
    }

    public void enviarCodigo() {

    }

    public void validarCodigo() {
        
    }

    public void reenviarCodigo() {

    }
}