import java.util.ArrayList;
import java.util.Scanner;

interface Biblioteca {
    String usuarioActual = null;

    void modoRegistro();

    void ingresarSalir();

    void modoSeleccion();

    void modoPrestamo();

    void modoPerfil();

    boolean autenticarUsuario(String username, String password);

    void registrarUsuario(String username, String password, String plan);
}

class Usuario {
    String username;
    String password;
    boolean premium;
    ArrayList<String> librosPrestados = new ArrayList<>();
    ArrayList<String> revistasPrestadas = new ArrayList<>();
    public Object plan;
    private Object premiu;

    public Object getPremiu() {
        return premiu;
    }

    public void setPremiu(Object premiu) {
        this.premiu = premiu;
    }

    // Constructor
    /**
     * @param username
     * @param password
     * @param esPremium
     */
    public Usuario(String username, String password, boolean esPremium) {
        this.username = username;
        this.password = password;
        this.premium = esPremium;
    }

    public Usuario(String username2, String password2, String plan) {
    }

    // Otros métodos según sea necesario
}

class BibliotecaImplementacion implements Biblioteca {
    Scanner scanner = new Scanner(System.in);
    Usuario usuarioActual;

    @Override
    public void modoRegistro() {
        System.out.println("Ingrese nombre de usuario:");
        String username = scanner.next();
        System.out.println("Ingrese contraseña:");
        String password = scanner.next();
        System.out.println("Seleccione plan (1. Gratis, 2. Premium):");
        int plan = scanner.nextInt();

        boolean esPremium = plan == 2;
        usuarioActual = new Usuario(username, password, esPremium);

        System.out.println("Usuario registrado con éxito.");
    }

    @Override
    public void ingresarSalir() {
        // Implementar lógica para ingresar/salir
    }

    @Override
    public void modoSeleccion() {
        // Implementar lógica para agregar libros y revistas
    }

    @Override
    public void modoPrestamo() {
        // Implementar lógica para préstamo
    }

    @Override
    public void modoPerfil() {
        // Implementar lógica para modificar perfil
    }

    @Override
    public boolean autenticarUsuario(String username, String password) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'autenticarUsuario'");
    }

    @Override
    public void registrarUsuario(String username, String password, String plan) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrarUsuario'");
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }
}

public class Bibliote {
    public static void main(String[] args) {
        BibliotecaImplementacion biblioteca = new BibliotecaImplementacion();

        // Ejemplo de uso
        biblioteca.modoRegistro();
        biblioteca.modoSeleccion();
        biblioteca.modoPrestamo();
        biblioteca.modoPerfil();
    }
}
