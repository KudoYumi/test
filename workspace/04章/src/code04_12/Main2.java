package code04_12;

public class Main2 {

	public static void main(String[] args) {
// switch文をシンプルにしてみる

		int[] seq = new int[10];


		//塩基配列をランダムに生成
		for(int i=0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}

		//生成した塩基配列の記号を表示
		for(int i=0; i < seq.length; i++) {

			char[] base = {'A','T','G','C'};
			System.out.println(base[seq[i]] +"");
		}
	}

}
