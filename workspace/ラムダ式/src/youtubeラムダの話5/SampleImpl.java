package youtubeラムダの話5;

class SampleImpl implements Sample{
	/* 外部のパッケージからアクセスしたくないから
	 * デフォルト修飾子
	 */

	@Override
	public void execute() {
		System.out.println("Hello");
	}
}
