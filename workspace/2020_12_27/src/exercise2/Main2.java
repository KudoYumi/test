package exercise2;

import java.time.LocalDate;

//setterを使って隠ぺい化されたデータを変更
public class Main2 {

	public static void main(String[] args) {
		ExecJuchu e = new ExecJuchu("icbk61",LocalDate.of(2020,11,7),2100,5,true);


		System.out.println("変更前");
		System.out.println(e.getCode());
		System.out.println(e.getDate());
		System.out.println(e.getQuantity()+"\n");

		//変更
		e.setDate(LocalDate.of(2020,8,30));
		e.setQuantity(12);

		System.out.println("変更後");
		System.out.println(e.getCode());
		System.out.println(e.getDate());
		System.out.println(e.getQuantity());


	}

}
