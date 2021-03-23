package 黒本10章55;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		Sample a = new Sample("A",30);
		Sample b = new Sample("B",20);
		Sample c = new Sample("C",10);
		Sample[] samples = {a,b,c};

		List<Sample> list = Arrays.asList(samples);
	//Arrays.asListは、配列をリストに変換するメソッド。

		Predicate<Sample> p = (Sample s) -> {return s.num>20;};

		test(list,p);
	}

	public static void test(List<Sample> list,Predicate<Sample> p) {
		for(Sample s:list) {
			if(p.test(s)) {
				System.out.println(s.str);
			}else {
				System.out.println("なんもヒットせず");
			}
		}
	}
}
