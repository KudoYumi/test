package 黒本6章_2;

import 黒本6章.Parent;

public class Child extends Parent{
	public static void main(String[] args) {
		System.out.println(new Child().num); //10
		System.out.println(Parent.name);
	}
}
