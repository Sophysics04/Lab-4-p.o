import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    ArrayList<Usuario> usuarios = new ArrayList<>();
    ArrayList<LibroRevista> catalogo = new ArrayList<>();
    ArrayList<Prestamo> prestamos = new ArrayList<>();
    Usuario usuarioActual;

    public void registrarUsuario(String username, String password, String plan) {
        Usuario nuevoUsuario = new Usuario(username, password, plan);
        usuarios.add(nuevoUsuario);
        // Guardar en CSV u otro medio de persistencia
    }

    public boolean autenticarUsuario(String username, String password) {
        for (Usuario usuario : usuarios) {
            if (usuario.username.equals(username) && usuario.password.equals(password)) {
                usuarioActual = usuario;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        // Menú principal
        System.out.println("1. Registrar usuario");
        System.out.println("2. Iniciar sesión");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.println("Ingrese nombre de usuario:");
            String username = scanner.next();
            System.out.println("Ingrese contraseña:");
            String password = scanner.next();
            System.out.println("Seleccione plan (Base/Premium):");
            String plan = scanner.next();
            biblioteca.registrarUsuario(username, password, plan);
        } else if (opcion == 2) {
            System.out.println("Ingrese nombre de usuario:");
            String username = scanner.next();
            System.out.println("Ingrese contraseña:");
            String password = scanner.next();
            if (biblioteca.autenticarUsuario(username, password)) {
                // Usuario autenticado, mostrar menú correspondiente al tipo de plan
                if (biblioteca.usuarioActual.plan.equals("Base")) {
                    // Menú para usuario Base
                } else {
                    // Menú para usuario Premium
                }
            } else {
                System.out.println("Usuario o contraseña incorrectos.");
            }
        }

        // Cerrar el scanner
        scanner.close();
    }
}
