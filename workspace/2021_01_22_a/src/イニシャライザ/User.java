package イニシャライザ;

public class User {
	static int money;
	private String name;
	private int age;

	public User() {
		System.out.println("引数なしのコンストラクタ起動");
	}

	public User(String name,int age){
		System.out.println("引数ありのコンストラクタ起動");
		System.out.println("インスタンスイニシャライザにより"+this.name+" "+this.age);

		this.name = name;
		this.age = age;
		System.out.println("値セットした");
		System.out.println(this.name+" : "+this.age);
	}

	// インスタンスイニシャライザ
	{
		System.out.println("インスタンスイニシャライザ起動");
		System.out.println
		("設定前のため、フィールド値は"+this.name+":"+this.age);
		System.out.println();
	 }
	{
		this.age = 32;
		this.name = "ゆみ";
		System.out.println("コンストラクタ起動前に値をセット");
		System.out.println("現時点のインスタンスのageは"+this.age);
		System.out.println("nameは"+this.name);
	 }


	//スタティックイニシャライザ
	static {
		System.out.println("staticイニシャライザ起動");
		System.out.println("設定前のstaticフィールドは"+User.money+"です");
	}

	static {
		User.money = 100;
	}
	static {
		System.out.println("変更後のstaticフィールドは"+User.money);
	}

}
