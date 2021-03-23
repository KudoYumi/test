package 黒本7章継承2;

public class Employee implements Worker{

	@Override
	public void work() {
		System.out.println("Employeeクラスのwork");
	}
}
