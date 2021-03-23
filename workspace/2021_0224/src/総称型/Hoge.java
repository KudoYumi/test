package 総称型;

public class Hoge<T> { //型パラメータTを受け取るHogeクラス

	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

}
