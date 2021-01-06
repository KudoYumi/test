package exercise3;

import java.time.LocalDate;
public class Product {
	private String number;
	private String name;
	private int price;
	private LocalDate date;
	private boolean stock;

	public Product(String number, String name, int price, LocalDate date, boolean stock) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
		this.date = date;
		this.stock = stock;
	}

	public int totalPrice(int quantity) {
		return price*quantity;
	}

	@Override
	public String toString() {
		return "Product [number=" + number + ", name=" + name + ", price=" + price + ", date=" + date + ", stock="
				+ stock + "]";
	}




}
