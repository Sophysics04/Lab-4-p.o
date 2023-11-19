import java.util.ArrayList;

public class Prestamo {
    Usuario usuario;
    ArrayList<LibroRevista> items = new ArrayList<>();
    int diasDeEntrega;
    String horarioEntrega;
    String sucursalRecogida;
    String direccionEnvio;
    int tiempoEsperaRecoger;
    String estado;

    public Prestamo(Usuario usuario) {
        this.usuario = usuario;
    }

    // Métodos para definir días de entrega, horario de entrega, etc.
}
