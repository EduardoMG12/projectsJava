import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o preço do produto? ");
        Double priceProduct = scanner.nextDouble();
        System.out.print("Quantos produtos você quer? ");
        Integer manyProducts = scanner.nextInt();

        Double resultProducts = priceProduct * manyProducts;
        String discountState = "não tem";
        if (manyProducts > 10){
            discountState = "tem";
           Double discountProduct = resultProducts * 10 / 100;
            resultProducts -= discountProduct;
        }
        System.out.println("Você " + discountState + " desconto, o preço final ficou em: " + resultProducts);
    }
}