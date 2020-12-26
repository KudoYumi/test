package zoho19_1;

class Nomal implements Member{
	protected int id;
	protected String name;
	protected final int monthlyPrice;

	public Nomal(int id,String nm) {
		this.id=id;
		this.name=nm;
		this.monthlyPrice=5000;
	}

	public String kind() {
		return "一般会員";
	}

	public int payment() {
		return (int)(monthlyPrice*1.08);
	}

	//getter
	public int getId() {return id;}

	public String getName() {return name;}

	public int getMnPr() {return monthlyPrice;}

}
