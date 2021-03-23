package 継承関係3;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		B b = (B)a; //A型のインスタンスをダウンキャストしてる
		b.hashCode();
	//	b.hello();

	}
}
