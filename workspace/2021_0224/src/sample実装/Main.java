package sample実装;

public class Main {
	public static void main(String[] args) {
		Operation op1 = new Multi();
		Operation op2 = new Add();
		Operation op3 = new Minus();

		Calculator calc1 = new Calculator(op1,10,205);
		Calculator calc2 = new Calculator(op2,10,2005);
		Calculator calc3 = new Calculator(op3,10,200);

		System.out.println(calc1.getResult());
		System.out.println(calc2.getResult());
		System.out.println(calc3.getResult());
	// setterの方がより電卓っぽい
	}
}
