import java.util.Scanner;

public class Main {

    private static final Biblioteca biblioteca = null;

    public static Biblioteca getBiblioteca() {
        return biblioteca;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Biblioteca biblioteca = new BibliotecaImplementacion();

        // Example usage
        biblioteca.modoRegistro();
        biblioteca.modoSeleccion();
        biblioteca.modoPrestamo();
        biblioteca.modoPerfil();

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
                if (usuarioActual.plan.equals("Base")) {
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
