package 黒本11章4;

public class Main extends Sample{
	@Override
	public void process() {
		System.out.println("MainB");
	}

	public static void main(String[] args) {
		Sample s = new Main();
		Sample s2 = new Sample();

		Func[] funcs = {new Sample(),new Main()};

		test(s);
		test(s2);
		System.out.println();

	/*	for(Func fu:funcs) {
			test(fu);
		}
	*/
	}

	public static void test(Func f) {
		f.process();
	}
}
