package equalsについて;

class Character {
	String name;
	String job;
	int hp;
	int level;

	Character(String name,String job,int hp,int level){
		this.name = name;
		this.job = job;
		this.hp = hp;
		this.level = level;
	}



	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof Character) {
				if( ((Character)obj).name == this.name ){
					return true;
				}
			}
		}
		return false;
	}
}


