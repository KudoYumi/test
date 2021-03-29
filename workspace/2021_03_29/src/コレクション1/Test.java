package コレクション1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Test {
	public static void main(String[] args) {
		for(Object obj:get()) { //get()の戻り値がCollection型ゆえ
			System.out.println(obj+",");
		}
	}

	static Collection<String> get(){
		Collection<String> list = new ArrayList<String>();
		list.add("B");
		list.add("C");
		list.add("A");
		Collections.reverse((List<String>)list);
		return list;
	}
}
