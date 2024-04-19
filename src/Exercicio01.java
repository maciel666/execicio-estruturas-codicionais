import java.time.Year;
import java.util.Scanner;

public class Exercicio01 {
  public static void main(String[] args) {
    // Escreva um programa que recebe
    // o ano de nascimento de uma pessoa
    // e verifica se é maior de idade ou não
    // (considerando que a maioridade seja aos 18 anos).

    // 1 - Solicitar o ano de nascimento
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o seu ano de nascimento: ");
    int anoNascimento = scanner.nextInt();

    // 2 - Fazer o calculo da idade ( ano atual - ano nascimento)
    int anoAtual = Year.now().getValue();
    int idade = anoAtual - anoNascimento;

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
