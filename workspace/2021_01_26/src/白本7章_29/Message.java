package 白本7章_29;

public class Message {
	String title;
	int value;

	public Message() {
		title = "Hello";
	}

	public Message(int value) {
		this();
		this.value = value;
		title += "World";
	}

	public static void main(String[] args) {
		Message me = new Message(5);
		System.out.println(me.title);
		System.out.println(me.value);
	}
}
