package exercise7;

import java.time.LocalDate;

public class Product {
	private String number;
	private String name;
	private int price;
	private LocalDate date;
	private boolean stock;

	public Product(String number, String name, int price, LocalDate date, boolean stock) {
		this.number = number;
		this.name = name;
		this.price = price;
		this.date = date;
		this.stock = stock;
	}

	public Product(String number, String name, int price, LocalDate date) {
		this.number = number;
		this.name = name;
		this.price = price;
		this.date = date;
		this.stock = true;
	}

	public Product() {
		number = "aa";
		name = "bu";
		price = 10;
		stock = true;
	}



	@Override
	public String toString() {
		return "Product [number=" + number + ", name=" + name + ", price=" + price + ", date=" + date + ", stock="
				+ stock + "]";
	}

	public static void main(String[] ars) {
		Product p = new Product();

		System.out.println(p);
	}




}
