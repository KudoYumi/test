package equalsについて;

public class Character {
	String name;
	int level;
	String job;

	Character(String name,int level,String job){
		this.name = name;
		this.level = level;
		this.job = job;
	}

	public boolean equals(Object x) {
		if(x!=null && (x instanceof Character)) {
			if(this.name == ((Character)x).name) {
				return true;
			}
		}
		return false;
	}
}
