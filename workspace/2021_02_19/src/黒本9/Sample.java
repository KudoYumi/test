package 黒本9;

public class Sample {
	public static void main(String[] args) {
		Runnable r =
				()->{ for(int cnt=0; cnt<10; cnt++)
					  	System.out.println(++cnt);
					 };

		new Thread(r).start();
	}
}
