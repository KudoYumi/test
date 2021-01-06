package exercise2;

import java.time.LocalDate;
class ExecJuchu {
	private String code;
	private LocalDate date;
	private int price;
	private int quantity;
	private boolean derivery;

	public ExecJuchu(String code, LocalDate date, int price, int quantity, boolean derivery) {
	//	super();
		this.code = code;
		this.date = date;
		this.price = price;
		this.quantity = quantity;
		this.derivery = derivery;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isDerivery() {
		return derivery;
	}

	public void setDerivery(boolean derivery) {
		this.derivery = derivery;
	}


}
