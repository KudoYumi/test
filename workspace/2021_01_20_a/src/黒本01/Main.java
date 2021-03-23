package 黒本01;
//8章３

public class Main {
	public static void main(String[] args) {
		try {
			sample();
			sub();
		}catch(SampleException e) {
			System.out.println("A");
	//	}catch(SubSampleException e) {
	/* ポリモフィズムにより
	 * SampleException型のcatchブロックでSubSample型の例外も受け取ってる。
	 */
			System.out.println("B");
		}
	}

	private static void sample() throws SampleException{
		throw new SampleException();
	}

	private static void sub() throws SubSampleException{
		throw new SubSampleException();
	}
}
