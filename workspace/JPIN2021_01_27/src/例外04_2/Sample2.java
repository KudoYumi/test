package 例外04_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2 {
	public static void main(String[] args){
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String line = null;
		int total = 0;

		System.out.println("> ");

		try {
			while((line = in.readLine()) != null) {
				try {
					int input = Integer.parseInt(line);
					if(input==0) {
						break;
					}
					total += input;
				}catch(NumberFormatException e) {
					System.out.println("invalid number");
				}
				System.out.println("> ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(total);
	}
}
