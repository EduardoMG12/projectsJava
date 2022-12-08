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
        setTotal();
    };
    Double getSubTotal(){
        return subTotal;
    };
    void setDiscount(Double discount){
        this.discount = discount;
        setTotal();
    };

    Double getDiscount(){
        return discount;
    };
    void setTotal(){
        if (discount == null){
            this.total = subTotal;
        }
        else{
            this.total = subTotal - discount;
        }
    };
    Double getTotal(){
        return total;
    };

}
