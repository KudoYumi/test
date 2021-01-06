package exe02;

public class Employee {
	private long id;
	private String name;
	private int age;

	public Employee(long id,String name,int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	/**
	 * @return id
	 */
	public long getId() {return id;}

	/**
	 * @param id セットする id
	 */
	public void setId(long id) {this.id = id;}

	/**
	 * @return name
	 */
	public String getName() {return name;}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {this.name = name;}

	/**
	 * @return age
	 */
	public int getAge() {return age;}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {this.age = age;}


}
