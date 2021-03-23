package 黒本11章31;

public class Main3 {
	public static void main(String[] args) {
		char[] arr1 = "HelloWorld".toCharArray();
		System.out.println(arr1);

		char[] arr2 = new char[arr1.length];
		System.arraycopy(arr1,1,arr2,1,arr1.length-1);
		System.out.println(arr2);

		System.out.println(arr1==arr2);

	}
}
