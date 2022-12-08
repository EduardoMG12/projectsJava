import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do seu peso:");
        Double peso = scanner.nextDouble();
        System.out.print("Digite o valor da sua altura:");
        Double altura = scanner.nextDouble();
        Double imc = peso / (altura * altura);
        System.out.printf("O seu indice de massa corporea é: %.2f", imc);
    }
}