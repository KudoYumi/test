package code15_04;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<100; i++) {
			sb.append("Java");
		}

		String s = sb.toString();

		System.out.print(s);

		System.out.println();

/*			s = "Java";
  		for(int i=0; i<100; i++){
 			s = s + s;
  		}
  		System.out.print(s);
*/

	}

}
