package code7_02;

public class Dog {
	 private String Name;
	 private int age;

	 public void setName( String nm ){
		 this.Name = nm;
	 }

	 public void setAge(int age) {
		 this.age = age;
	 }

	 public void showProfile(){
		 System.out.println( "名前は、" + this.Name + "です。" );
		 System.out.println("年齢は"+this.age+"です");
	 }


}
