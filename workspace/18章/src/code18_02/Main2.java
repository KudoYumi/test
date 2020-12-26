package code18_02;

import java.io.FileWriter;

public class Main2 {
 //try-with-resourcesの場合

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("data.txt");){
			fw.write('そ');
			fw.write('れ');
			fw.write('で');
			fw.write('は');
			fw.write(85);
			fw.write(109);

		}catch(Exception c) {
			System.out.println("何らかの例外発生");
		}

	}

}
