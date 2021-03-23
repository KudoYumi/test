package listに関して;

import java.util.ArrayList;
import java.util.List;

public class StringLsit {

	private List list = new ArrayList();

	public void add(String str) {
		list.add(str);
	}

	public String get(int index) {
		return (String)list.get(index);
	}
}
