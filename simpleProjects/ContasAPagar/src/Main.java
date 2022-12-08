import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da conta de luz: ");
        final Integer contaDeLuz = scanner.nextInt();
        System.out.print("Digite o valor da conta de agua: ");
        final Integer contaDeAgua = scanner.nextInt();
        System.out.print("Digite o valor da conta de telefone: ");
        final Integer contaDeTelefone = scanner.nextInt();
        System.out.print("Digite o valor da escola do filho: ");
        final Integer contaEscolaFilho= scanner.nextInt();
        System.out.print("Digite o valor da fatura do cartão de crédito: ");
        final Integer faturaDoCartao = scanner.nextInt();
        System.out.print("Digite o valor dos gastos com o mercado: ");
        final Integer gastosComSupermercado = scanner.nextInt();
        final Integer totalContas = gastosComSupermercado + faturaDoCartao + contaEscolaFilho + contaDeTelefone + contaDeAgua + contaDeLuz;
        System.out.println("Os gastos totais das suas contas foram de: " + totalContas);
    }
}