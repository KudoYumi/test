package cast演算式;

public class Main {
	public static void main(String[] args) {
		Worker work1 = new Salary();
		Worker work2 = new Employee();

		System.out.println(work1 instanceof Salary);
		System.out.println(work2 instanceof Salary);

		Salary s1 = (Salary)work2;
	/* 不正なキャスト演算子は
	 * 不正なキャストという例外が発生する。
	 */
	}
}
