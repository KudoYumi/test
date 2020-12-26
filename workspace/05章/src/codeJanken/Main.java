package codeJanken;

public class Main {

	public static void main(String[] args) {
		System.out.println("選択してください 0.グー 1.チョキ 2.パー");

			int me = new java.util.Scanner(System.in).nextInt();
			int robot = new java.util.Random().nextInt(3);


			if(me == robot) {
				System.out.println("あいこです");

			} else {
				if(me == 0) {
					if(robot == 1) {
						System.out.println("あなたの勝ちです");
					} else {  //robot==2は省略
						System.out.println("あなたの負けです");
					}

				} else if(me == 1) {
					if(robot == 2) {
						System.out.println("あなたの勝ちです");
					} else {
						System.out.println("あなたの負けです");
					}

				} else {
					if(robot == 0) {
						System.out.println("あなたの勝ちです");
					} else {
						System.out.println("あなたの負けです");
					}
				}


			}


	}

}
