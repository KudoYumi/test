package ファイルの読み書き;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//
public class SampleReader {
	public static void main(String[] args) {
		BufferedReader br = null;

		try{
			br = new BufferedReader(new FileReader("test.txt"));
			String line;

			while((line = br.readLine()) != null) {
				System.out.println(line);
			}

		}catch(FileNotFoundException e) {

		}catch(IOException e) {

		}finally { //オープンしたら必ずclose必要
			try {
				if(br != null) {
					br.close();
				}
			}catch(IOException e) {

			}
		}

	}
}
