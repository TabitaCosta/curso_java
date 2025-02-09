import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número para que eu retorne a tabuada do mesmo:");
        
        int numero = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) { // Começando de 1 até 10
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
        scanner.close(); // Fechando o Scanner
    }
}
