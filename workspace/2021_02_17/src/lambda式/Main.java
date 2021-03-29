package lambda式;

public class Main {
	public static void main(String[] args) {
		Func f = (name,age)
				-> { System.out.println("お名前は"+name+"ですね");
					 System.out.println("ご年齢は"+age+"ですね");
					 System.out.println(age+"歳、"+name+"さま登録しました");};

		f.hoge("クドウ", 32);
	}
}
