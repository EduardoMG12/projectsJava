package ReplenishStock;

public class main {
    public static void main(String[] args) {
        Product product = new Product();

        product.name="Cheetos";
        product.quantityInStock= 9;
        product.reloadStock();

    };
}
