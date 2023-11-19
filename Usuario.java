import java.util.ArrayList;

public class Usuario {
    String username;
    String password;
    String plan;
    ArrayList<Prestamo> prestamos = new ArrayList<>();

    public Usuario(String username, String password, String plan) {
        this.username = username;
        this.password = password;
        this.plan = plan;
    }

    public void cambiarPlan(String nuevoPlan) {
        this.plan = nuevoPlan;
    }
    // Otros métodos...
}
