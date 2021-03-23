package ラベル;

public class Main {
	public static void main(String[] args) {
		int num = 1;

		x:
		for(int i=0; i<3; i++) {
			y:
			for(int j=0; j<5; j++) {
				System.out.println("いまのiの値は"+i);
				if(j==2) {
					break;
				}

				if(j==3) {
					System.out.println("いまのiの値は"+i+"。ラベルに戻る");
					break x;
				}
				num += i;
				System.out.println("j="+j+"numに"+i+"加算された\n");
			}
		}
		System.out.println(num);
	}
}
