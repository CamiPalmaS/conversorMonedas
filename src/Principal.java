import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;
        String moneda1;
        String moneda2;
        String cantidad;
        String menu = """
                ******************
                Bienvenido al conversor de monedas. Qué conversión quiere realizar?
                1) Dólar >> Peso Argentino
                2) Peso Argentino >> Dólar
                3) Dólar >> Real Brasileño
                4) Real Brasileño >> Dólar
                5) Dólar >> Peso Chileno
                6) Peso Chileno >> Dolar
                7) Salir
                *****************
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 7){
            System.out.println(menu);
            String entrada = teclado.nextLine();

            try {
                opcion = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 7.");
                continue; // Vuelve al menú
            }
            switch (opcion){
                case 1:
                    moneda1 = "USD";
                    moneda2 = "ARS";
                    System.out.println("Ingrese la cantidad");
                    cantidad = teclado.nextLine();
                  new Consultar(moneda1, moneda2, cantidad);
                  break;
                case 2:
                    moneda1 = "ARS";
                    moneda2 = "USD";
                    System.out.println("Ingrese la cantidad");
                    cantidad = teclado.nextLine();
                    new Consultar(moneda1, moneda2, cantidad);
                    break;
                case 3:
                    moneda1 = "USD";
                    moneda2 = "BRL";
                    System.out.println("Ingrese la cantidad");
                    cantidad = teclado.nextLine();
                    new Consultar(moneda1, moneda2, cantidad);
                    break;
                case 4:
                    moneda1 = "BRL";
                    moneda2 = "USD";
                    System.out.println("Ingrese la cantidad");
                    cantidad = teclado.nextLine();
                    new Consultar(moneda1, moneda2, cantidad);
                    break;
                case 5:
                    moneda1 = "USD";
                    moneda2 = "CLP";
                    System.out.println("Ingrese la cantidad");
                    cantidad = teclado.nextLine();
                    new Consultar(moneda1, moneda2, cantidad);
                    break;
                case 6:
                    moneda1 = "CLP";
                    moneda2 = "USD";
                    System.out.println("Ingrese la cantidad");
                    cantidad = teclado.nextLine();
                    new Consultar(moneda1, moneda2, cantidad);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
        System.out.println("Ejecución Acabada. Buen día");
    }
}
