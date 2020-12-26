package code17_01;
import java.io.*;

public class Main2 {

	public static void main(String[] args) {
		try{
			FileWriter fw = new FileWriter("data.txt");
			throw new IOException("エラーです中断します");

		} catch(IOException e) {
			System.out.println("エラー:"+e.getMessage());
			e.printStackTrace();
		}

	}

}
