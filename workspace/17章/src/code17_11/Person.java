package code17_11;

public class Person {
	int age;

	public void setAge(int age) {
		if(age<0) { //引数が0以上かどうかチェック。
			throw new IllegalArgumentException
				("年齢は0以上の数字を指定すべきです。指定値=" +age);

	// テキストのP.686の6行目からは、以下でもオッケー
		}else {
			this.age = age;  // age>=0ならフィールドに値をセット
		}

	}

}
