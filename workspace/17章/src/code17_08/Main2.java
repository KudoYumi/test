package code17_08;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		FileWriter fw = null;

		try {
			fw = new FileWriter("data.txt");
			fw.write("hello");

		}catch(Exception e) {
			System.out.println("何らかの例外発生");

		}finally {
			if(fw!=null) {
				try {
					fw.close();
				}catch(IOException e) {
					;
				}
			}
		}
	}

}
