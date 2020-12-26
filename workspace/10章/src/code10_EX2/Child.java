package code10_EX2;

public class Child extends Parents{
	int age;

/*	int getAge() {
		return this.age;
	} */

/* Childクラスは親クラスからgetAgeメソッド継承してるはず。
 * 継承してるだけでChildにgetAgeがあるわけではない。
 * mainでch.age=20 でこのクラスのフィールドを20で初期化して、
 * getAgeないから、一戸内側を探す。
 * ParentsクラスにはgetAgeあったからそれを動作。
 */

	void setAge(int age) {
		super.age = age;
	}

	int getSuperAge() {
		return super.age;
	}
}
