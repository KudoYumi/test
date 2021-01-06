package commain;

import com.sample2.Factory;
import com.sample2.Sample;

public class Main2 {

	public static void main(String[] args) {
		Sample sample = Factory.create();
		sample.execute();
	}
}
