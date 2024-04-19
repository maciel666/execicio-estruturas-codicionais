import java.util.Scanner;

/**
 * Escreva um programa que recebe três
 * números do usuário e imprime o maior deles.
 */

public class Exercicio05 {
  public static void main(String[] args) {
    // 1 - Solicite três números inteiros para o usuário
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe um número");
    int numero1 = scanner.nextInt();

    System.out.println("Informe um número");
    int numero2 = scanner.nextInt();

    System.out.println("Informe um número");
    int numero3 = scanner.nextInt();
    // 2 - Verificar se o primeiro número é maior que o segundo e maior que o
    // terceiro
    if (numero1 > numero2 && numero1 > numero3) {
      // 3 - Se sim, imprima o número
      System.out.println(numero1);
    } else {
      // 4 - Senão, verificar se o segundo número é maior que o primeiro e maior que o
      // terceiro
      if (numero2 > numero1 && numero2 > numero3) {
        // 5 - Se sim, imprima o número
        System.out.println(numero2);
      } else {
        // 6 - Senão, verificar se o terceiro número é maior que o segundo e maior que o
        // primeiro
        if (numero3 > numero1 && numero3 > numero2) {
          // 7 - Se sim, imprima o número
          System.out.println(numero3);
        }
      }
    }

    int maiorNumero = 0;
    if (numero1 > numero2 && numero1 > numero3) {
      maiorNumero = numero1;
    } else if (numero2 > numero1 && numero2 > numero3) {
      maiorNumero = numero2;
    } else if (numero3 > numero1 && numero3 > numero2) {
      maiorNumero = numero3;
    }
    System.out.println(maiorNumero);

    scanner.close();
  }
}

