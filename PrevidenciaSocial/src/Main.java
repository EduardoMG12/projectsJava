import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        final Integer idade = scanner.nextInt();
        System.out.print("Digite Quanto tempo voce contribuiu: ");
        final Integer tempoDeContribuicao = scanner.nextInt();
        final String validacao;
        if (idade >= 55 && tempoDeContribuicao >= 25){
            validacao = "Pode-ra contribuir";
        }else {
            validacao = "Não poderá contribuir";
        }
        System.out.print(validacao);
    }
}