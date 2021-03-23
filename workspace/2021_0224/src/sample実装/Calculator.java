package sample実装;

public class Calculator {
	private int num1;
	private int num2;
	private Operation op;

	public Calculator(Operation op,int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}

	public int getResult() {
		return op.execute(num1,num2);
	}

}
