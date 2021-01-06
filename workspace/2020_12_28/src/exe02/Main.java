package exe02;

public class Main {

	public static void main(String[] args) {
		Manager m = new Manager(110,"森下",32,"プロジェクトマネジャー");

		System.out.println
			(m.getId()+"\t"+m.getName()+"\t"+m.getAge()+"\t"+m.getTitle());
	}

}
