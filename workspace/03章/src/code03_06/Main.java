package code03_06;

public class Main {

	public static void main(String[] args) {
// 制御構文の応用
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(i*j); //i=1で固定して、jを1～9まで変化させて積の結果
				System.out.print(" "); //これでスペース
			}
			System.out.println(""); //改行
		}

	}

}
