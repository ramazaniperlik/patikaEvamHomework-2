package ramazaniperlik;

public class WaterBillServices extends BaseBillServices{
    @Override
    public void payment() {
        System.out.println("Su faturası ödeme işlemi gerçekleşti.");
    }

    @Override
    public void findBill() {
        System.out.println("Su faturası listelendi");
    }

    @Override
    public void cancelBill(){
        System.out.println("Su faturası iptal edildi.");
    }
}
