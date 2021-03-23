package ファイルの読み書き;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//ファイルの書き込みをPrintWriterクラスを使って行う。

public class SampleWrite {
	public static void main(String[] args) {

		PrintWriter pw = null;
		try {
			pw = new PrintWriter("test.txt"); //コンストラクタの引数に出力ファイル名
			pw.println("TEST");


		/* 出力ファイルがない場合は、新規に作成される。
		 * PrintWriterクラスのコンストラクタは、
		 * 検査例外FileNotFoundExceptionをスローする可能性あるから、
		 * try-catch必須。
		 * FileNotFoundExceptionは指定ファイルが作成できなかった時とかにスローされる。
		 *
		 * 例外発生しない時は、12行目で
		 * 参照変数pwにnewで作成したPrintWriterオブジェクトへの参照を代入。
		 *
		 * PrintWriterオブジェクトを取得した＝ファイルをオープンできた
		 * てことだから、
		 * 13行目でPrintWriterオブジェクトの持つprintlnメソッド使って
		 * ファイルに書き込み。
		 */

		}catch(FileNotFoundException e) {

		}finally { //オープンしたファイルは使用後必ずcloseしないとだから、このfinallyブロック必須
			if(pw != null) {
				pw.close();
			}
		}
	/* finallyブロックは、例外がスローされるされない問わず、
	 * 必ず実行されるから、
	 * このようにopenしたファイルを
	 * finallyブロックでcloseするのが一般的考え方。
	 */
	}
}
