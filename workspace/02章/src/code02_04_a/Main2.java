package code02_04_a;

public class Main2 {

	public static void main(String[] args) {
		double a = 10;
		a++;
		System.out.println(a);

		double b = 10;
		System.out.println(b++ +50);

		System.out.println(++b +50);

		System.out.println(a++ +50 + ++a);
		//いまa=11だから、a++ +50で61でaは12になり、
		//++aは13だから、61+13=74　この過程で合ってますか？
		//→正解！！



		//値よりも大きな型の変数に代入が可能。逆は無理。
		float f = 3;
		double d = f;
		System.out.println(f);
		System.out.println(d);

		int x = 3;
		long y = x;
		System.out.println(y);

		long s = 10;
		double t = s;
		float u = s;
		System.out.println(t);
		System.out.println(u);

		//抑えるべきは箱の大きさは、
		//double＞float＞long＞int


		//データよりも小さい箱に代入　エラー
		byte i = -127;
		short j = 32767;
		int k = 2147483647;

		float l = 9000000000000000000000000.0000077777777777F;
		//ここは数学の集合と論理の考えで考えれば簡単

		short s1 = 100;
		//byte t1 = s1;
		//これはコンパイラでは変数の中身までは見れないからデカいものを小さいのには入れれないからエラー



	}

}
