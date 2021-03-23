package コレクションの基本;

// ArrayListの基本
import java.util.ArrayList;

public class Sample1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("X");
		list.add(null);
		list.add("Z");
	// 要素が追加されるたびにインデックス番号が0,1,2....と割り当てられる。

	// 格納した要素の取り出しはgetメソッド
		System.out.println(list.get(1));
	}
}
