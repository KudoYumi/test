package kaiin1;

public class Member {
	protected int id;
	protected String name;
	protected int monthlyPrice;

	public Member(int id,String name) {
		this.id = id;
		this.name = name;
		this.monthlyPrice = 5000;
		/* フィールドでfinal宣言しないのは、
		 * カプセル化されてたら直接呼び出せないから
		 * ここで初期化した？
		 */
	}

	public int payment() {
		return (int)(this.monthlyPrice*1.08);
	}

	public int getId() {return this.id;}

	public String getName() {return this.name;}

	public int getMonthlyPrice() {return this.monthlyPrice;}
}
