import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Qual o preço do seu produto, para mim calcular o frete:");
        final Integer productPrice = scanner.nextInt();

        if (productPrice >= 100) {
            System.out.println("O total da sua compra é de 100 reais, o frete já está incluido. ");
        } else if (productPrice < 100) {
            System.out.println("O total da sua compra é de " + (productPrice + 15) +  " reais, já com o frete já incluido");
        }

    }
}