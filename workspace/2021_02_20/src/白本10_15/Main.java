package 白本10_15;

public class Main {
	static final int[] array = new int[] {100,200};

	static {
		array[0] = 10;
		array[1] = 20; //arrayの中の要素はfinalでない
	}

	static{
	//	array = new int[4]; arrayの中の参照先は変更できない
	}
}
