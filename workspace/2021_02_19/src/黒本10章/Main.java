package 黒本10章;

public class Main {
	public static void main(String[] args) {
		int num = 1;

		x:
		for(int i=0; i<3; i++) {
			y:
			for(int j=0; j<5; j++) {
				if(j==1) {
					continue;
				}
				if(j==3) {
					break y;
				}
				num += i;
				System.out.println("i="+i+",j="+j+" num:"+num);
			}
			System.out.println(
					
					);
		}
		System.out.println(num);//7
	}
}
