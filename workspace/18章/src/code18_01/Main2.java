package code18_01;

import java.io.FileReader;

//Main1のthrows宣言外したらtry-catchしないといけないので、それが以下。
//close必要なのがMain2、必要ないのがMain3

public class Main2 {

	public static void main(String[] args) {
		FileReader fr = null; //すべてのスコープで使えるよう外にてfrを定義した。

		try {
			fr = new FileReader("data.txt");
			int input = fr.read();

			while(input != -1) {
				System.out.print((char)input);
				input = fr.read();
			}

		}catch(Exception e) {
			System.out.println("何らかの例外発生");

		}finally {
			if(fr != null) {
				try {
					fr.close();
				}catch(Exception e) {
					;
				}
			}
		}

	}
}
