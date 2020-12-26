package equalsについて;

public class Sample {
	public static void main(String[] args) {
		Character c1 = new Character("工藤",52,"訓練校生");
		Character c2 = new Character("工藤",52,"訓練生");
		
		

		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
	}
}
