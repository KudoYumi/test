package インターフェイスの話5;

public interface Sample {
	/* interfaceは実装持ってないから
	 * 継承と違ってsuper使って、親クラスの実装呼び出すようなこと
	 * しないから多重実現オッケー。
	 *
	 * Javaでは多重継承はダメ。
	 */

	void hoge();
}
