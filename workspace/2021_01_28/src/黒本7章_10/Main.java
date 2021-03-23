package 黒本7章_10;

public class Main {
	public static void main(String[] args) {
	//create futureを表示するには、ポリモ使えない
		new Eng().create();//とするしかない。
		System.out.println();

	//reportを表示するにはEmpのインスタンスからでも、EngからでもOK
		new Eng().report();
		new Emp().report();

		Emp e = new Eng();
		e.report(); //ポリモ

		System.out.println();

	//workはEmpのインスタンス、Engのインスタンス、
	//またはWorkerの実装だから
		Worker w1 = new Emp();
		w1.work();

		Worker w2 = new Eng();
		w2.work();
	}
}
