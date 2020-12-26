package code14_EX;

public class Main {

	public static void main(String[] args) {
		Account ac = new Account();
		ac.accountNumber = "4649";
		ac.balance = 1592;

		System.out.println(ac);

		Account ac2 = new Account();
		ac2.accountNumber = " 4649";
		ac.balance = 1591;


		if(ac.equals(ac2)) {
			System.out.println("同じものです");
		} else {
			System.out.println("違うものです");
		}

	}

}
