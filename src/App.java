import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        try {
            // Leer los números enteros
            System.out.println("Ingresa el primer número entero:");
            int num1 = leer.nextInt();

            System.out.println("Ingresa el segundo número entero:");
            int num2 = leer.nextInt();

            System.out.println("Ingresa el tercer número entero:");
            int num3 = leer.nextInt();

            // Sumar los dos menores
            int sumaMenores = sumarDosMenores(num1, num2, num3);
            System.out.println("La suma de los dos menores es: " + sumaMenores);

            // Restar los dos mayores
            int restaMayores = restarDosMayores(num1, num2, num3);
            System.out.println("La resta de los dos mayores es: " + restaMayores);

            // Encontrar el mayor de los tres
            int mayor = encontrarMayor(num1, num2, num3);
            System.out.println("El mayor de los tres números es: " + mayor);
        } catch (Exception e) {
            System.out.println("Error: Debes ingresar un número entero válido.");
        }
    }

    // Método para sumar los dos números menores
    public static int sumarDosMenores(int a, int b, int c) {
        int menor1 = Math.min(Math.min(a, b), c);
        int menor2 = (a != menor1) ? a : (b != menor1) ? b : c;
        return menor1 + menor2;
    }

    // Método para restar los dos números mayores
    public static int restarDosMayores(int a, int b, int c) {
        int mayor1 = Math.max(Math.max(a, b), c);
        int mayor2 = (a != mayor1) ? a : (b != mayor1) ? b : c;
        
            return mayor1 - mayor2;
        
    
    }

    // Método para encontrar el mayor de los tres números
    public static int encontrarMayor(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
