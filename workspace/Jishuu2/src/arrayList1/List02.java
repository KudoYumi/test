package arrayList1;

import java.util.ArrayList;

public class List02 {

	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<>();

		points.add(10);
		points.add(20);
		points.add(30);
		points.add(40);

		for(int i=0; i<points.size(); i++) {
			System.out.println(points.get(i));
		}
	}

}
