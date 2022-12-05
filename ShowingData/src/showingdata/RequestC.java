package showingdata;

public class RequestC {

    Integer code;
    Double subTotal;
    Double discount;
    Double total;

    void setCode(Integer code){
        this.code = code;
    };
    Integer getCode(){
         return code;
    };
    void setSubTotal(Double subTotal){
        this.subTotal = subTotal;
    };
    Double getSubTotal(){
        return subTotal;
    };
    void setDiscount(Double discount){
        this.discount = discount;
    };
    Double setDiscount(){
        return discount;
    };
    void setTotal(){
        this.total = subTotal - discount;
    };
    Double getTotal(){
        return total;
    };

}
