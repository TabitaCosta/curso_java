package exercicios;

import java.util.Scanner;

public class teste {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
         * Exercício 1 – Switch de dia da semana
         * Exibe mensagem de acordo com o valor da variável diaSemana
         */
        int diaSemana = 3;

        switch (diaSemana) {
            case 5:
                System.out.println("oiiiiii");
                break;
            case 3:
                System.out.println("oooo");
                break;
            default:
                System.out.println("Dia não configurado");
                break;
        }

        /*
         * Exercício 2 – Verificação de Categoria de preço
         * - Menor que 50: barato
         * - Entre 50 e 100: médio
         * - Maior que 100: caro
         */
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        if (preco < 50) {
            System.out.println("Barato");
        } else if (preco > 100) {
            System.out.println("Caro");
        } else {
            System.out.println("Médio");
        }

        /*
         * Exercício 3 – Validação de Login
         * - Nome: admin
         * - Senha: 1234
         */
        scanner.nextLine(); // limpa o buffer do teclado

        System.out.print("Digite seu nome: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Digite sua senha numérica: ");
        int senhaUsuario = scanner.nextInt();

        String admin = "admin";
        int senha = 1234;

        if (admin.equals(nomeUsuario) && senha == senhaUsuario) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }

        scanner.close();
    }
}
