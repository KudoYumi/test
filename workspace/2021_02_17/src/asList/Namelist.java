package asList;

import java.util.LinkedList;
import java.util.List;

public class Namelist {
	public static void main(String[] args) {
		List<String> namelist = new LinkedList<>();

		namelist.add("湊");
		namelist.add("綾部");
		namelist.add("菅原");
		namelist.add("渡辺");

		for(String name:namelist) {
			System.out.println(name);
		}
	}
}
