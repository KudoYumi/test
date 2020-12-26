package code18_01;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) throws Exception{ //try-catchしなくていい。(理由はP.682)
		FileReader fr = new FileReader("data.txt");
		int input = fr.read();

		while(input != -1) {
			System.out.println((char)input);
			input = fr.read(); //inputが-1でないなら、再度read実行。-1になったら中断。
		}
		/*-1ならファイルを読み込み終わったことになるから、
		 *それまでは１文字ずつ取り出すって意味。
		 */


		fr.close();

	}
	//6行目でthrows宣言してるから、try-catchの処理しなくて済んだ。


}
