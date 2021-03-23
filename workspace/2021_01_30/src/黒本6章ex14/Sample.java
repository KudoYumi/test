package 黒本6章ex14;

public class Sample {

	Sample(){
		System.out.println("A");
	}

	{
		System.out.println("B");
	}

	static {
		System.out.println("staticイニシャライザ");
	}
}
