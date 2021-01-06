package commain;

import youtubeラムダの話4.Factory;
import youtubeラムダの話4.Sample;

public class Main4 {
	public static void main(String[] args) {
		Sample sample = Factory.create();
		sample.execute();
	}
}
