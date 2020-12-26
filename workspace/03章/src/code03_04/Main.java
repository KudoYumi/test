package code03_04;

public class Main {

	public static void main(String[] args) {
//3種類のif構文
		double height;
		String size;

		System.out.println("身長入力して");
		height = new java.util.Scanner(System.in).nextDouble();

		if(height>=170.0) {
			size = "L";
		}else if(height>=155.0) {
			/*else ifと書かれてる時点で上の条件式170以上"ではない場合"としてるから
			height<170は省略がルール*/
			size = "M";
		}else if(height>=140.0){
			size = "S";
		}else {
			size = "Nothing";
		}

		System.out.println("あなたに合う服のサイズは"+size+"です");
	}

}
