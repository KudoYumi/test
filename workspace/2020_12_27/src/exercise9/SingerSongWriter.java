package exercise9;

public class SingerSongWriter extends Singer{
	private String name;

	public SingerSongWriter(String name) {
		super(name);
		this.name = name;
	}

	/* このように継承クラス作ると
	 * Singerクラスのフィールドが継承されず
	 * 意図せず新たにnameを書き換えたりされる恐れが。
	 * Singerクラスの修飾子にもfinalをつけて
	 * 継承できなくすれば、変更できないクラス定義の完成
	 */
}
