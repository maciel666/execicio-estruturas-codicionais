/*
 * Crie um programa que pede ao usuário 
 * para digitar sua nota em uma disciplina 
 * e imprime se ele foi aprovado (nota maior ou igual a 6) 
 * ou reprovado.

 */

 import java.util.Scanner;

 public class Exercicio06 {
   public static void main(String[] args) {
     // 1- Solicitar a nota da disciplina para o usuário
     Scanner scanner = new Scanner(System.in);
     System.out.println("Informe a nota da disciplina: ");
     double nota = scanner.nextDouble();
 
     // 2 - Validar se a nota é maior ou igual a 6
     // if (nota > 6 || nota == 6 )
     if (nota >= 6) {
       // 3 - Se sim, imprimir aprovado
       System.out.println("Aprovado");
     } else {
       // 4 - Senão, imprimir reprovado
       System.out.println("Reprovado");
     }
     scanner.close();
   }
 }
    

