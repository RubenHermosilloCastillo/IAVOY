
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola, soy " + "Ruben");
        System.out.println("Tengo " + (69 - 2) + " años.");
        System.out.println("Dame un numero para hacer algo con la condicional no se");
        int edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("Ya estas ruco we");
        } else {
            for (int k = 1; k < edad; k++) {
                System.out.println("Casi te confundo con un bebe de "+ edad +" años");
            }
        }
    }
}
