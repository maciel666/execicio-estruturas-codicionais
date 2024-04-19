/*
 * Desenvolva um programa que pede ao usuário para 
 * digitar um ano e verifica se é bissexto ou não. 
 * Um ano é bissexto se for divisível por 4, 
 * mas não por 100, a menos que também 
 * seja divisível por 400.
 */

 import java.util.Scanner;

 public class Exercicio08 {
   public static void main(String[] args) {
     // solicitar ano para o usuario
     Scanner scanner = new Scanner(System.in);
     System.out.println("Informe um ano");
     int ano = scanner.nextInt();
     // Um ano é bissexto se for divisível por 4,
     if (ano % 4 == 0 &&
         ((ano / 100 != 0) ||
             (ano % 400 == 0))) {
       System.out.printf("%d é um ano bisexto", ano);
       // mas não por 100, a menos que também
       // seja divisível por 400.
     } else {
       System.out.printf("%d não é um ano bisexto", ano);
     }
     scanner.close();
   }
 }
