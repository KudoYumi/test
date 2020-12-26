package code18_02;

import java.io.FileWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		int a=90;

		int x = new java.util.Random().nextInt(100);

		FileWriter fw = new FileWriter("data.txt");
		fw.write('そ');
		fw.write('れ');
		fw.write('で');
		fw.write('は');
		fw.write(85);

		fw.write((char)a); //int型の整数90を無理やりchar型へ変換した
		fw.write((char)x);

		fw.close();
	}
}
