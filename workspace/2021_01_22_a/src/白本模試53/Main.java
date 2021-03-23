package 白本模試53;

public class Main {
	public static void main(String[] args) {
		int num = 0;
		
		do {
			if(num<2) {
				continue;
			}
			System.out.println(num);

		}while(num++<5);
	}
}
