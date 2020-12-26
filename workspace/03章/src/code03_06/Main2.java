package code03_06;

public class Main2 {

	public static void main(String[] args) {
// 繰り返しの中断
		for(int i=1; i<10; i++) {
			if(i==3) {
				break; //iが3の時中断、即座にこのブロックの作業中断
			}
			System.out.println(i);
		}


		System.out.println();



		for(int i=1; i<10; i++) {
			if(i==3) {
			continue; // iが3の時はここで上に戻るからSysoutされない。
			}
			System.out.println(i);
		}
	}

}
