package listに関して;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		List list = new ArrayList();

		for(int i=0; i<10; i++) {
			list.add(new Integer(i));
		}
	}
}
