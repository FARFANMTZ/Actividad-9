//  María de la Luz Farfán Martínez    3007517
// Ramsés González Valencia
// Actividad 9
import java.util.Scanner;

class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private double peso;

    public Perro(String nombre, String raza, int edad, double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
    }

    // Getters y setters para los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método para comer
    public void comer(String tipoComida, double cantidadGramos) {
        System.out.println(nombre + " está comiendo " + cantidadGramos + " gramos de " + tipoComida);
    }

    // Método para ladrar
    public String ladrar() {
        return "guau guau";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del primer perro:");
        System.out.print("Nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Raza: ");
        String raza1 = scanner.nextLine();
        System.out.print("Edad: ");
        int edad1 = scanner.nextInt();
        System.out.print("Peso: ");
        double peso1 = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.println("Ingrese los datos del segundo perro:");
        System.out.print("Nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Raza: ");
        String raza2 = scanner.nextLine();
        System.out.print("Edad: ");
        int edad2 = scanner.nextInt();
        System.out.print("Peso: ");
        double peso2 = scanner.nextDouble();

        // Crear dos objetos Perro
        Perro perro1 = new Perro(nombre1, raza1, edad1, peso1);
        Perro perro2 = new Perro(nombre2, raza2, edad2, peso2);

        // Invocar los métodos para cada perro
        perro1.comer("croquetas", 200);
        System.out.println(perro1.ladrar());

        perro2.comer("huesos", 300);
        System.out.println(perro2.ladrar());

        scanner.close();
    }
}
