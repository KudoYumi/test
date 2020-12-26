package code13_13;

public class Hero {
	private String name;

	public void setName(String name) {
		if(name == null) {
			throw new IllegalArgumentException
			("名前がnullです。処理中断");
		}

		if(name.length() <= 1) {
			throw new IllegalArgumentException
			("名前が短すぎる。");
		}

		if(name.length() >= 8) {
			throw new IllegalArgumentException
			("名前が長すぎる。");
		}

		this.name = name;
	}
}
