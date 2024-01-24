package figuras;

public class Trapecio {
    public static void calculateArea() {
        double base1 = 0, base2 = 0, h;
        boolean valid;

        do{
            valid = base1 > base2;

            System.out.print("Ingrese la longitud de la base menor: ");
            base1 = Double.parseDouble(App.scanner.nextLine());
            System.out.print("Ingrese la longitud de la base mayor: ");
            base2 = Double.parseDouble(App.scanner.nextLine());
            
            if(!valid){
                System.out.println("La base menor introducida es mayor que la base mayor introducida");
            }
        }while(!valid);
        
        System.out.print("Ingrese la altura del trapecio: ");
        h = Double.parseDouble(App.scanner.nextLine());
        double area = ((base1 + base2) * h) / 2;
        System.out.println("El área del trapecio es: " + area);
    }
}
