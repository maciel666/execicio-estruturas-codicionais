/*
 * Desenvolva um programa que 
 * verifica se um número é divisível por 7.
 */

 import java.util.Scanner;

 public class Exercicio04 {
   public static void main(String[] args) {
     // 1 - Solicite um número inteiro para o usuário
     Scanner scanner = new Scanner(System.in);
     System.out.println("Informe um número");
     int numero = scanner.nextInt();
     // 2 - Verifique se o resto da divisão do número por 7 é igual a zero
     if (numero % 7 == 0) {
       // Se sim, informe que o número é divisível por 7
       System.out.printf("%d é divisível por 7", numero);
     } else {
       // Se não, informe que o número não é divisível por 7
       System.out.printf("%d não é divisível por 7", numero);
     }
     scanner.close();
   }
 }
    

