package code16_01;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer>points = new ArrayList<Integer>();

		points.add(10); // points.add(Integer.valueOf(10))を省略
		points.add(80); // points.add(Integer.valueOf(80))
		points.add(75); // points.add(Integer.valueOf(75))

		for(int i:points) {
			System.out.println(i);
		}

		//拡張for文で値を代入可能か？⇒無理
		for(Integer i:points) {
			i = Integer.valueOf(20);
		}

		for(Integer i:points) {
			System.out.println(i.intValue());
			// オートボクシングによりi.intValue()はiでもいい
		}

	}

}
