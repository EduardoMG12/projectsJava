package firstclass;

public class FirstClass {

    public static void main(String[] args){
    Product product = new Product();

    product.name = "Ruffles chips";
    product.priceUni = 5.99;
    product.quantity = 5;

    printQuantityStock(product);
    }
    static void printQuantityStock(Product product){

        System.out.println("Name product: "+ product.name);
        System.out.println("In stock: "+ product.quantity);
        System.out.println("Price unity: "+ product.priceUni);
        System.out.println("Value all products in stock: "+ (product.priceUni * product.quantity));

    }

}
