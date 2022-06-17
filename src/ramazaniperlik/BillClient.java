package ramazaniperlik;

public class BillClient{

    public void payment(BaseBillServices billServices){
        billServices.payment();
    }
    public void accordingtoFindBill(BaseBillServices billServices){
        billServices.findBill();
    }
    public void cancelBill(BaseBillServices billServices){
        billServices.cancelBill();
    }

}
