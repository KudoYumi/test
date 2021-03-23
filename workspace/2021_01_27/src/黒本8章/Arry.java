package 黒本8章;

public class Arry {
	static byte value;

	public static void main(String[] args) {
		addValue("127");
		System.out.println(value);
	}

	public static void addValue(String v) throws NumberFormatException{
		value = Byte.parseByte(v);

	}
}
