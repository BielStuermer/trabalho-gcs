import java.util.Scanner;
import java.util.Random;

public class trabalho {
    
    public static void numAleatorio() {
        Random rand = new Random();
        System.out.println("10 números aleatórios entre 0 e 100:");
        for (int i = 0; i < 10; i++) {
            System.out.print(rand.nextInt(101) + " ");
        }
        System.out.println();
    }

    public static void frase(String nome, double altura, int idade) {
        System.out.println(nome + " tem " + idade + " anos e mede " + altura + " metros de altura.");
    }

    public static int soma(int valor) {
        int soma = 0;
        System.out.println("Resultado da soma:");
        for (int i = 0; i <= valor; i++) {
            soma += i;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção");
            System.out.println("1 - 10 numeros aleatórios de 0-100");
            System.out.println("2 - Nome, Altura e Idade");
            System.out.println("3 - Somar os valores consecutivamente");
            System.out.println("0 - Fechar o programa");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                numAleatorio();
            } 
            
            else if (opcao == 2) {
                System.out.print("Digite seu nome: ");
                String nome = sc.nextLine();
                System.out.print("Digite sua altura: ");
                double altura = sc.nextDouble();
                System.out.print("Digite sua idade: ");
                int idade = sc.nextInt();
                frase(nome, altura, idade);
            } 
            
            else if (opcao == 3) {
                System.out.print("Digite um valor: ");
                int valor = sc.nextInt();
                if (valor >= 0) {
                    System.out.println("Sua soma é: " + soma(valor));
                } else {
                    System.out.println("Valor inválido!");
                }
            } 
            
            
            else if (opcao == 0) {
                System.out.println("Programa encerrado.");
            } 
            
            
            else {
                System.out.println("Opção inválida, tente novamente.");
        }
    } while (opcao != 0);
        
        sc.close();
    }
}