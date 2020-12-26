package code03_04;

public class Main4 {

	public static void main(String[] args) {
	// 練習
		System.out.println("住んでる区を入力して");

		String ku = new java.util.Scanner(System.in).nextLine();

		switch (ku) {
		case "新宿":
		case "しんじゅく":
		case "シンジュク":

			System.out.println("花園神社ある");
			break;

		default:
			System.out.println("正しい区の名前入れて");
		}
	}

}
