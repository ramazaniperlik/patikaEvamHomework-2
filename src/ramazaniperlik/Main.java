package ramazaniperlik;

import javax.security.auth.login.AccountException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//	BillClient billClient = new BillClient();
//	billClient.payment(new InternetBillServices());
//	billClient.payment(new PhoneBillServices());
//	billClient.accordingtoFindBill(new InternetBillServices());
//	billClient.cancelBill(new InternetBillServices());

			System.out.println("\nSeçim yapınız.\n");
			System.out.println("1 - Kayıt ol ");
			System.out.println("2 - Fatura öde");
			System.out.println("3 - Fatura sorgula");

			Scanner input = new Scanner(System.in);
			int choseProcess = input.nextInt();
			switch (choseProcess) {
			case 1 -> {
//				ArrayList<MemberAccount> newMember = new ArrayList<>();

				MemberAccount newMember = new MemberAccount();

				System.out.println("Id giriniz");
				int id = input.nextInt();
				newMember.setId(id);

				System.out.println("İsim giriniz");
				String name = input.next();
				newMember.setName(name);

				System.out.println("Soyisim giriniz");
				String surname = input.next();
				newMember.setSurname(surname);

				System.out.println("Bakiye giriniz");
				double balance = input.nextDouble();
				newMember.setBalance(balance);

				newMember.getMemberCode();

				System.out.println("Telefon numarası giriniz");
				String phone = input.next();
				newMember.setPhone(phone);

				MemberAccountServices memberService = new MemberAccountServices();
				memberService.create(newMember);


//				MemberAccount newMember = new MemberAccount(id,name,surname,balance,phone);
//				MemberAccountServices memberService = new MemberAccountServices();
//				memberService.create(newMember);


			}
			case 2 -> System.out.println("Fatura Öde");
			case 3 -> System.out.println("Fatura Sorgula");


//		MemberAccount uye1 = new MemberAccount(1,"Ramazan","İperlik",25,"5383593892");
//		System.out.println(uye1.getMemberCode());

		}
	}
}