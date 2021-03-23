package 黒本3章;

public class Main {
	public static void main(String[] args) {

		Sample s1 = new Sample(10);
		Sample s2 = s1;
		s1 = new Sample(10);

		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode()==s2.hashCode());
	}
}
