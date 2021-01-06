package commain;

import com.sample3.Factory;
import com.sample3.Sample;

public class Main3 {

	public static void main(String[] args) {
		Sample sample = Factory.create();
		sample.execute();
	}

}
