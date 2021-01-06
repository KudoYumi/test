package exe03;

import java.util.Scanner;

public class Exec {

	public static void main(String[] args) {
		Member[] members = new Member[3];

		for(int i=0; i<members.length; i++) {
			System.out.println((i+1)+"人目の登録");
			System.out.print("名前＞");
			String putName = new Scanner(System.in).nextLine();

			System.out.print("性別＞");
			String putGender = new Scanner(System.in).nextLine();

			System.out.print("年齢＞");
			int putAge = new Scanner(System.in).nextInt();

			members[i] = new Member(putName,putGender,putAge);
			System.out.println();

			//これで各要素のフィールドが初期化
		}

		System.out.println("会員一覧表");

		for(Member m:members) {
			System.out.println
			(m.getName()+"\t|"+m.getGender()+"\t|"+m.getAge());
		}
	}

}