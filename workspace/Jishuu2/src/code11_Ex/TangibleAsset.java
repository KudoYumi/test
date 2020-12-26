package code11_Ex;

public abstract class TangibleAsset {
	String name;
	int price;
	String color;

	public TangibleAsset(String name,int price,String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}
}
