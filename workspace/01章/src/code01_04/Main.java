package code01_04;

public class Main {

	public static void main(String[] args) {
		final double PI = 3.14;  // 円周率π finalつけることで定数扱い
		int pie = 5;       // お菓子のパイの半径cm

		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
		System.out.println("パイの半径を倍にします");

		pie = 10;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);

	}

}
