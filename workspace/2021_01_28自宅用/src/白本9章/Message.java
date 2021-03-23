package 白本9章;

public class Message {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String msg = "Thank you";

		sb.append("Thank").append(" you");

		System.out.println(msg.equals(sb.toString()));
	}
}
