package youtubeラムダの話7;

@FunctionalInterface
public interface Sample {
	public void execute();
	//1つしか抽象メソッドないからラムダ式の中身をここに代入できるが、

//	public abstract void test();
	/* こんな風にもう一個あると
	 * Factoryクラスでエラー
	 * 代入するのはどっちのメソッドなのかコンピュータがわからないから。
	 *
	 * 関数型インタフェースではメソッドは基本１個。
	 * 許されるのは、デフォルトメソッド、staticメソッド。
	 *
	 * 間違えて2つ以上抽象メソッド書かないように上記のように
	 * アノテーションつけるべき。
	 */
}
