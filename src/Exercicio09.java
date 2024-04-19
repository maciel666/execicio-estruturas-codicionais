/*
 *Faça um programa que recebe a altura e 
  o sexo (M/F) de uma pessoa e verifica 
  se ela está dentro dos padrões de altura 
  considerados normais para o sexo informado
  (homens com altura entre 160 e 190 cm, 
   mulheres entre 150 e 180 cm). * 
 */

 import java.util.Scanner;

 public class Exercicio09 {
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     // 1 - Solicitar a altura da pessoa
     System.out.println("Informe sua altura");
     double altura = scanner.nextDouble();
     // 2 - Solicitar o sexo da pessoa
     System.out.println("Informe seu sexo");
     char sexo = scanner.next().charAt(0);
 
     // 3 - Verificar se o sexo e altura estão dentro dos padrões
     // homens com altura entre 160 e 190 cm
     if ((sexo == 'm' || sexo == 'M') &&
         (altura >= 160 && altura <= 190)) {
       System.out.println("A sua altura está dentro dos padrões para o sexo masculino.");
       // mulheres entre 150 e 180 cm
     } else if ((sexo == 'f' || sexo == 'F') &&
         (altura >= 150 && altura <= 180)) {
       System.out.println("Sua altura está dentro dos padrões para o sexo feminino. ");
     } else {
       System.out.println("Sua altura está fora dos padrões.");
     }
     scanner.close();
   }
 }
