public class Planeta {
    private String nombre;
    private int cantidadSatelites;
    private double masa, volumen, diametro, distanciaAlSol;
    private boolean esObservable;

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, double diametro,
                   double distanciaAlSol, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.esObservable = esObservable;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre + "\nCantidad de satélites: " + cantidadSatelites +
                "\nMasa: " + masa + "\nVolumen: " + volumen + "\nDiámetro: " + diametro +
                "\nDistancia al sol: " + distanciaAlSol + "\nEs observable: " + esObservable);
    }

    public double calcularDensidad() {
        return masa / volumen;
    }

    public static void main(String[] args) {
        Planeta p1 = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
        Planeta p2 = new Planeta("Jupiter", 1, 1.899E27, 1.4313E15, 139820, 750000000, true);

        System.out.println("Datos del planeta Tierra:");
        p1.imprimirDatos();
        System.out.println("Densidad: " + p1.calcularDensidad() + "\n");

        System.out.println("Datos del planeta Júpiter:");
        p2.imprimirDatos();
        System.out.println("Densidad: " + p2.calcularDensidad());
    }
}
