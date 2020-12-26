package code10_EX2;

public class Main {

	public static void main(String[] args) {
		Child ch = new Child();
		Parents p = new Parents();

		p.age = 50;
		ch.age = 20;

		System.out.println(ch.getAge());
	//	System.out.println(ch.SuperAge());//なんでこっちは0なの？ParentsクラスにgetAge()あるのに。
		System.out.println(p.getAge());  //こっちは大丈夫



		/* chを使ってどうにか親のageを設定したいなら、
		   Childクラスに親クラスのフィールドageを設定するような
		   setterメソッドを作る。
		   そこから設定。
		*/
		ch.setAge(45);
		System.out.println(ch.getSuperAge());
	}



}
