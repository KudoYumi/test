package youtube_equals3;

public class Item {
	private int id;
	private String name;

	public Item(int id,String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {return false;}
		if(obj instanceof Item == false) {return false;}

		if(this.id == ((Item)obj).id)  {
			return true;
		}

		return false;
	}

	// hashCodeのオーバーライド
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

}