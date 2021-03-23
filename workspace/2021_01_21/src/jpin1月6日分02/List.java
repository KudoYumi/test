package jpin1月6日分02;

public class List {
	private String value;
	private int index; //自分が何番目なのか
	private List next;


	public List() { //公開してるコンストラクタ
		this.value = null;
		this.index = 0;
		this.next = null;
	}

	private List(int index) { //←非公開なコンストラクタ
		this();
		this.index = index;
	}



	public void add(String value) {
		if(this.value == null) {
			this.value = value;
			return; //制御をaddメソッド呼び出した側に戻す。
		}

	//上記のif文に引っかからなかったら、valueはnullでないてこと。
		if(this.next == null) {
			this.next = new List(index+1); //自分の番号がindexだから次はindex+1番目
		}
		this.next.add(value);
	}

	public String get(int index) {
		if(this.index == index) { //自分自身の番号と受け取った数字が等しい時
			return this.value;
		}
		if(this.next == null) { //一致しなくて自分の次がnullの時
			return null;
		}

		// 自分自身の番号と引数の数字が一致せず、かつ自分の次がnullでないとき。
		return this.next.get(index);
	}

	public int size() {
		if(this.next == null) {
			return this.index + 1;
		}
		return this.next.size();
	}
}
