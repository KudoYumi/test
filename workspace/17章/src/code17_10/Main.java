package code17_10;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("data.txt");){
			fw.write("hello");
			throw new IOException("エラーです。中断します。"); //意図的に例外発生

		}catch(Exception e) {
			System.out.println("何らかの例外が発生しました");
		}
	}

}
