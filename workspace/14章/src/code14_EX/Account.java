package code14_EX;

public class Account {
	String accountNumber;
	int balance;

	public String toString() {
		return "\\" + this.balance + "(口座番号:" + this.accountNumber + ")";
	}

	public boolean equals(Object o) {
		if(this==o) {return true;}  //参照値一緒だからtrue

		if(o instanceof Account) { //等価の判定
			Account a = (Account)o;

			String an1 = this.accountNumber.trim();
			String an2 = a.accountNumber.trim();

			if(an1.equals(an2)) {
				return true;
			}
		}
		return false;
	}
}
