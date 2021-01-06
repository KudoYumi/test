package exe09;

public class Name {
	private String value;

	public Name(String value) {
		super();
		this.value = value;
	}

	public boolean validate() {
		if(this.value == null) {
			return false;
		}
		if(this.value.length() == 0) {
			return false;
		}
		return true;
	}
}
