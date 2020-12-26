package code17_02;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("hello");
			fw.close();
			throw new IOException("エラーです");



// P.667のcatch文を２つとも同一のものとしたいなら以下のように書けばよい。

		}catch(IOException | NullPointerException e){
			System.out.println("エラーです");
		}


	}

}
