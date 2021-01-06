package reflection2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Sample {
	public void test(Object obj) throws Exception{
		// Object型だから、何型かわからない

		Class clazz = obj.getClass();
	/* クラス名が明確なら「クラス名.class」クラスリテラル使って
	 * クラスの定義情報取り出せたが、いまは何型かわからない。
	 *
	 * だからObject型が持っている、getClassメソッドを使って
	 * クラスの定義情報を得られる。
	 *
	 * 定義情報を得られたので、名前などを調べてみる。
	 */
		System.out.println(clazz.getName());

		Field[] fields = clazz.getDeclaredFields();
		for(Field f:fields) {
			System.out.println(f.getName());
		}

	//以上で名前はわかった。次は実際に動かしてみる。


	/* 何型のインスタンスが渡されたのか、
	 * そのインスタンスがどんなメソッド持ってるか
	 * わからなくても、実行することはできる。
	 * それが以下。
	 */

		Method[] methods = clazz.getDeclaredMethods();
		for(Method m:methods) {
			System.out.print(m.getName()+":"); //メソッド名
			System.out.println(m.invoke(obj)); //そのメソッドの実行結果
		}
	}
}
