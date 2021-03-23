package 白本10_40;

public class Main1 {
	static int value;

	public static void main(String[] args) {
		addValue("130");
		System.out.println(value
				);
	}

	static void addValue(String v) throws NumberFormatException{
		value = Integer.parseInt(v);
	}
}
