package カプセル化してラムダ;

public interface Algorithm {
	void perform(String name,int cnt);

	public static Algorithm create() { //実装をAlgorithm型としてreturn
		Algorithm al = (name,cnt)->
						{ for(int i=0; i<cnt; i++)
							System.out.println("hello"+name);
						 };
		return al;
	}
}
