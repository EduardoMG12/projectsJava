import java.util.Scanner;

public class CalcularValorTroco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor o produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print("Digite o valor pago: ");
        Double valorPago = scanner.nextDouble();

        if (valorPago > valorProduto) {
            System.out.print("O troco é de: " + ( valorPago  - valorProduto) + " reais");
        }
        else if (valorPago < valorProduto){
            System.out.println("O valor o produto é maior que o valor pago");
        }
        else  {
            System.out.println("Nao sobrou troco");
        }
        scanner.close();
    }

}
