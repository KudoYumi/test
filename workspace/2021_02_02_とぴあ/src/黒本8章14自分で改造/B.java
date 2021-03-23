package 黒本8章14自分で改造;

public class B extends A{
	private int num;

	public B(int num) {
		super(num);
		this.num = num;
	}

//	@Override //Aでオーバーライドしたものをさらにオーバーライド
	public boolean equals(Object obj) {
		if(obj instanceof B) {
			B b = (B)obj;
			return this.num == b.num;
		}
		return false;
	}

}
