package 黒本11章66;

public class Main {
	public static void main(String[] args) {
		try {
			if(args.length!=0) {
				sample(null);
			}else {
				sample(args[0]);
			}
		}catch(RuntimeException re) {
			System.out.println("非検査exception");

		}catch(Exception e) {
			System.out.println("検査例外");
		}
	}

	private static void sample(String str) throws Exception{
		if(str==null)
			throw new Exception();

		throw new RuntimeException();
	}
}
