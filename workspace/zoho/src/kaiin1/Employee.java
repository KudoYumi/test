package kaiin1;

public class Employee extends Member{
	protected String officeName;

	public Employee(int id,String name,String officeName) {
		super(id,name);
		this.officeName = officeName;
	}

	public int payment() {
		return (int)(this.monthlyPrice*1.08*0.5);
	}

	public String getOfficeNm() {
		return this.officeName;
	}
}
