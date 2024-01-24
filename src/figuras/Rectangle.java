// Rectangle.java
package figuras;

public class Rectangle {
    public static void calculateArea() {
        System.out.print("Ingrese la base del rectángulo: ");
        double base = Double.parseDouble(App.scanner.nextLine());
        System.out.print("Ingrese la altura del rectángulo: ");
        double height = Double.parseDouble(App.scanner.nextLine());
        double area = base * height;
        System.out.println("El área del rectángulo es: " + area);
    }
}