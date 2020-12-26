package portfolio2;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero("ゆみ",1000,1000,100);
		
		Hero x1 = new Hero("はげ",4000,4000,20);
		
		h.attack(x1); //なんで0？
	}

}
