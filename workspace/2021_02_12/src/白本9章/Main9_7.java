package 白本9章;

public class Main9_7 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String msg = "ThankYou"; //コンスタントプールにある

		sb.append("Thank").append("You"); //sbのオブジェクトはThankYouの文字持ってる

		if(msg.equals(sb.toString())) {
			System.out.println("同値オブジェクト");
		}

	}
}
