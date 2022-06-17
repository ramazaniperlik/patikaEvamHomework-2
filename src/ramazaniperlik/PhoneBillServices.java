package ramazaniperlik;

public class PhoneBillServices extends BaseBillServices{

    @Override
    public void payment() {
        System.out.println("Telefon Ödeme işlemi gerçekleşti.");
    }

    @Override
    public void findBill() {
        System.out.println("Telefon faturası listelendi");
    }

    @Override
     public void cancelBill(){
        System.out.println("Telefon faturası iptal edildi.");
        }
}
