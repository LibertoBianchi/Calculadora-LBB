import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        calculdora();
    }

    public static void calculdora() {
        String opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Para operar, inserta en la consola que operación quieres realizar");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("[1] Sumar");
        System.out.println("[2] Restar");
        System.out.println("[3] Multiplicación");
        System.out.println("[4] División");
        System.out.println("[5] Resto");
        System.out.println("[6] Salir");
        System.out.println("Inserta tu opción : ");
        opcion = sc.nextLine();
        switch (opcion) {
            case "1":
                System.out.println("Has seleccionado suma");
                suma();
                break;

            case "2":
                System.out.println("Has seleccionado resta");
                resta();
                break;

            case "3":
                System.out.println("Has seleccionado multiplicación");
                multiplicacion();
                break;

            case "4":
                System.out.println("Has seleccionado división");
                division();
                break;

            case "5":
                System.out.println("Has seleccionado resto");
                resto();
                break;

            case "6":
                System.out.println("\nApagando...");
                break;


            default:
                System.out.println("\n Inserta un caracter válido\n");
                calculdora();
        }
    }

    public static void suma() {
        double operador1;
        double operador2;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSelecciona el primer operador : ");
        operador1 = sc.nextDouble();
        System.out.println("Selecciona el segundo operador : ");
        operador2 = sc.nextDouble();
        System.out.println("\n El resultado de la suma es el siguiente : " + (operador1 + operador2)+"\n");
        calculdora();
    }

    public static void resta() {
        double operador1;
        double operador2;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSelecciona el primer operador : ");
        operador1 = sc.nextDouble();
        System.out.println("Selecciona el segundo operador : ");
        operador2 = sc.nextDouble();
        System.out.println("\n El resultado de la resta es el siguiente : " + (operador1 - operador2)+"\n");
        calculdora();
    }

    public static void multiplicacion() {
        double operador1;
        double operador2;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSelecciona el primer operador : ");
        operador1 = sc.nextDouble();
        System.out.println("Selecciona el segundo operador : ");
        operador2 = sc.nextDouble();
        System.out.println("\n El resultado de la multiplicación es el siguiente : " + (operador1 * operador2)+"\n");
        calculdora();
    }

    public static void division() {
        double operador1;
        double operador2;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSelecciona el primer operador : ");
        operador1 = sc.nextDouble();
        System.out.println("Selecciona el segundo operador : ");
        operador2 = sc.nextDouble();
        System.out.println("\n El resultado de la división es el siguiente : " + (operador1 / operador2)+"\n");
        calculdora();
    }

    public static void resto() {
        double operador1;
        double operador2;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSelecciona el primer operador : ");
        operador1 = sc.nextDouble();
        System.out.println("Selecciona el segundo operador : ");
        operador2 = sc.nextDouble();
        System.out.println("\n El resultado del resto es el siguiente : " + (operador1 % operador2)+"\n");
        calculdora();
    }


}
