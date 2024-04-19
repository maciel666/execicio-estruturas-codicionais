/*
 * Faça um programa que recebe um caractere do usuário 
 * e verifica se é uma vogal ou consoante.
*/

import java.util.Scanner;

public class Exercicio07 {
  public static void main(String[] args) {
    // 1 - Solicitar uma letra para o usuário
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe uma letra");
    char letra = scanner.next().charAt(0);
    // 2 - Validar se a letra é uma vogal
    if (letra == 'A' || letra == 'a' ||
        letra == 'E' || letra == 'e' ||
        letra == 'I' || letra == 'i' ||
        letra == 'O' || letra == 'o' ||
        letra == 'U' || letra == 'u') {
      // 3 - Se sim, imprima a mensagem dizendo que a letra é uma vogal
      System.out.printf("%c é uma vogal", letra);
    } else {
      // 4 - Se não, imprima a mensagem dizendo que a letra é uma consoante
      System.out.printf("%c é uma consoante", letra);
    }

    // Complicado de manter - Não fazer isso
    if (letra == 'A' || letra == 'a') {
      // 3 - Se sim, imprima a mensagem dizendo que a letra é uma vogal
      System.out.printf("%c é uma vogal", letra);
    } else {
      if (letra == 'E' || letra == 'e') {
        System.out.printf("%c é uma vogal", letra);
      } else {
        if (letra == 'I' || letra == 'i') {
          System.out.printf("%c é uma vogal", letra);

        } else {
          if (letra == 'O' || letra == 'o') {
            System.out.printf("%c é uma vogal", letra);

          } else {
            if (letra == 'U' || letra == 'u') {
              System.out.printf("%c é uma vogal", letra);

            } else {
              // 4 - Se não, imprima a mensagem dizendo que a letra é uma consoante
              System.out.printf("%c é uma consoante", letra);
            }
          }
        }
      }

    }

    scanner.close();
  }
}
