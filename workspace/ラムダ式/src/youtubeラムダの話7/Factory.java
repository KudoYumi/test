package youtubeラムダの話7;

//匿名クラス
public class Factory {
	public static Sample create() {
		Sample sample = () ->{
			System.out.println("lambda");
		};
		return sample;
	}
	//4のラムダ式をわかりやすくしたコード。
	/* interface型の変数sampleにラムダ式を代入。
	 *
	 * ラムダ式を代入することにより、
	 * このSample型インスタンスがどういう動きをするか決まるので、
	 * それをreturnしている。
	 */
}
