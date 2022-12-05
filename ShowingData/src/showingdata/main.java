package showingdata;

public class main {
    public static void main(String[] args){
        RequestC request1 = new RequestC();

        request1.setCode(12335);
        request1.setDiscount(200.00);
        request1.setSubTotal(2000.00);
        request1.setTotal();
        System.out.print(request1.getTotal());

    }
  }


