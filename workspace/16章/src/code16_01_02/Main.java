package code16_01_02;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		String names[] = new String[3];

		for(String s:names) {
			System.out.println(s);
		}



		ArrayList<String>name = new ArrayList<String>();
		name.add("すがわら");
		name.add("あさか");
		name.add("すがわら");

		for(int i=0; i<name.size(); i++) {
			System.out.print(name.get(i));
		}

		for(String s:name) {
			System.out.println(s);
		}

	}

}
