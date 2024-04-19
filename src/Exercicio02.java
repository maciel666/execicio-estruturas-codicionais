import java.util.Scanner;

    public class Exercicio02 {
      public static void main(String[] args) {
        // Crie um programa que recebe a idade
        // de uma pessoa e verifica se ela é
        // menor de idade (menor que 18 anos) ou maior de idade.
    
        // 1 - Solicitar a idade da pessoa
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a sua idade: ");
        int idade = scanner.nextInt();
        // 3 - Verificar se a idade é maior ou igual a 18
        if (idade >= 18) {
          // 4 - Se sim, imprima a idade com a mensagem que é maior de idade
          System.out.printf("Sua idade é %d. Você é maior de idade.", idade);
        } else {
          // 5 - Senão, imprima a idade com a mensagem que é menor de idade
          System.out.printf("Sua idade é %d. Você é menor de idade.", idade);
        }
        scanner.close();
    
      }
    }
    

