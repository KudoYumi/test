package exe08;

public class Main {

	public static void main(String[] args) {
		Member m = new Member();

		if(m instanceof Member) {
			System.out.println("Member型です");
		}

		if(m instanceof Version) {
			System.out.println("Version型です");
		}
	}

}
