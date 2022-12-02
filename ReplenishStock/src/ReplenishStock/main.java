package ReplenishStock;

public class main {
    public static void main(String[] args) {
        Product product = new Product();

        product.name="Cheetos";
        product.quantityInStock= 11;

        if(reloadStock(product)){
            System.out.print("Tera que repor o estoque de " + product.name + " pois apenas existem " + product.quantityInStock+ " em estoque ");
        }
        if(!reloadStock(product)){
            System.out.print("Voce tem " + product.quantityInStock + " "+ product.name + " em estoque");
        }

    }
    static Boolean reloadStock(Product product){
        Boolean outOfStock = true;
        if (product.quantityInStock < 10){

            outOfStock = true;

        }
        if(product.quantityInStock > 10){

            outOfStock = false;
        };
        return outOfStock;


    };
}
