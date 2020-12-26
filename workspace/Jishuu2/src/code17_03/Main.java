package code17_03;
import java.io.FileWriter;

// 大雑把に例外発生時の表示内容

public class Main {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("hello");
			fw.close();

		}catch(Exception e) {
			System.out.println("何らかの例外処理が発生しました");
		}
	}

}
