package zohoRPG1_3;


public class Fighter {
	String name;
	String job;
	int hp;
	int dmg;

	Fighter(String name,int hp){
		this.name = name;
		this.job = "戦士";
		this.hp = hp;
	}

	void run() {
		System.out.println("モンスターから逃げた");
	}

	void attack(Monster m) {
		dmg = new java.util.Random().nextInt(10)+1;
		System.out.println(job+name+"の攻撃！");

		System.out.println("モンスターに"+dmg+"のダメージ");
		m.hp -= dmg;

		if(m.hp<=0) {
			System.out.println(name+"がモンスター倒した");
		}

	}
}
