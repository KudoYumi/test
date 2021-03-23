package 黒本10章6;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		try {
			while(true) {
				list.add("hello");
			}
		}catch(RuntimeException re) {
			System.out.println("A:非検査例外");

		}catch(Exception e) {
			System.out.println("B:検査例外");

		}catch(Error e) {
			System.out.println("容量オーバーエラー");
		}
		System.out.println("C");
	}
}
