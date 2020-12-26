package code03_Kitasoft;
// 3-3
public class Main3 {

	public static void main(String[] args) {
		System.out.println("xに数値入力して");
		int x = new java.util.Scanner(System.in).nextInt();

		System.out.println("yに数値入力して");
		int y = new java.util.Scanner(System.in).nextInt();

		if(x>y) {
			System.out.println("xはyよりも大きい");
		}else if(x<y){
			System.out.println("xはyより小さい");
		} // elseはx==yのときだが、ここではなんも出力しないから略

	}

}
