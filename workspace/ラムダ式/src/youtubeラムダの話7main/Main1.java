package youtubeラムダの話7main;

import youtubeラムダの話7.Sample;
import youtubeラムダの話7.Test;

public class Main1 {

	public static void main(String[] args) {
		Test test = new Test();
		test.process(new Sample() {
			@Override
			public void execute() {
				System.out.println("hello from main");
			}
		});
	}

}
