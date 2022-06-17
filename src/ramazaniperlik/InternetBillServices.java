package ramazaniperlik;

public class InternetBillServices extends BaseBillServices{

    @Override
    public void payment() {
        System.out.println("Internet Ödeme işlemi gerçekleşti.");
    }

    @Override
    public void findBill() {
        System.out.println("Internet faturası listelendi");
    }

    @Override
    public void cancelBill() {
        System.out.println("Internet faturası iptal edildi.");
    }
}
