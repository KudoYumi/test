package equalsと例外;

public class Main {
	public static void main(String[] args) {
		A a = new A(10);
		B b = new B(10);

		System.out.println(a.getNum()==b.getNum()); //基本データ型での比較

		try {
			System.out.println(a.equals(b));//例外

		}catch(ClassCastException e){
			System.out.println("キャスト失敗");

		}
	}
}
