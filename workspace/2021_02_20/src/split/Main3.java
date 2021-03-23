package split;

public class Main3 {
	public static void main(String[] args) {
		String str = "a b 3 d 10 e";
		String[] array = str.split("\\d"); //3のとこで分割
		System.out.println(array[0]); //ab
		System.out.println(array[1]); //d
		System.out.println(array.length);
	}
}
