package ReplenishStock;

public class Product {

    String name;
    Double price;
    String description;
    Integer quantityInStock;



    Boolean reloadStock() {
        Boolean outOfStock = true;
        if (quantityInStock < 10) {

            outOfStock = true;

        }
        if (quantityInStock > 10) {

            outOfStock = false;
        }
        ;
        if (outOfStock) {
            System.out.println("Tera que repor o estoque de " + name + " pois apenas existem " + quantityInStock + " em estoque ");
        }
        if (!outOfStock) {

            System.out.println("Voce tem " + quantityInStock + " " + name + " em estoque");
        }
        return outOfStock;

    }
}
