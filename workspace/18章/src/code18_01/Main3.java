package code18_01;

import java.io.FileReader;

public class Main3 {
	// try-with-resources文(P.679)

	public static void main(String[] args) {
		try(FileReader fr = new FileReader("data.txt");){

			int input = fr.read();
			while(input != -1) {
				System.out.print((char)input);
				input = fr.read();
			}

		}catch(Exception e) {
			System.out.println("何らかの例外発生");
		}

	}

	//Main2、Main3どちらでも書けるのが望ましい。
}
