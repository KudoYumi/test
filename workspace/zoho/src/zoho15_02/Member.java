package zoho15_02;

public class Member {
	private String name;
	private String gender;
	private int age;

	//コンストラクタ
	public Member(String name,String gender,int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	//これでフィールドに値代入した。
	//デフォルトコンストラクタはなし。
	}

	public String getName() {
		return this.name;
	}

	public String getGender() {
		return this.gender;
	}

	public int getAge() {
		return this.age;
	}
}
