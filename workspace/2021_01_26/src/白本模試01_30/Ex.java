package 白本模試01_30;
//Exで処理を終えてMainには送らない。
public class Ex {
	void exec() {
		try{
			(new RunEx()).exec();
		}catch(Exception e) {
			System.out.println("検査例外");
		}
	}
}
