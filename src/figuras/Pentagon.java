// Pentagon.java
package figuras;

public class Pentagon {
    public static void calculateArea() {
        System.out.print("Ingrese el lado del pentágono: ");
        double side = Double.parseDouble(App.scanner.nextLine());
        System.out.print("Ingrese la apotema del pentágono: ");
        double apothem = Double.parseDouble(App.scanner.nextLine());
        double area = 0.5 * 5 * side * apothem;
        System.out.println("El área del pentágono es: " + area);
    }
}