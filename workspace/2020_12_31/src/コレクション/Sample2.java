package コレクション;

import java.util.ArrayList;
public class Sample2 {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();

		for(int i=0; i<5; i++) {
			number.add(i*i);
		}

		for(Integer n:number) {
			System.out.println(n);
		}


		
		
		System.out.println("\n"+number.get(0)+"\n");

		number.set(3,3);
		for(Integer n:number) {
			System.out.println(n);
		}
	}

}
