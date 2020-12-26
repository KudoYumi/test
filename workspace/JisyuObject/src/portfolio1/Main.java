package portfolio1;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("石原",9000,9000,150,200);
		Hero h2 = new Hero("大西",9999,9999,200,180);
		Hero h3 = new Hero("貝原",4500,4500,200,100);
		
		Hero h4 = new Hero("北川",6000,6000,150,200);
		Hero h5 = new Hero("工藤",4000,4000,250,255);
		Hero h6 = new Hero("小林",9999,9999,100,150);
		
		Hero h7 = new Hero("白井",3000,3000,100,200);
		Hero h8 = new Hero("田中",3800,3800,200,250);
		
		Hero h9 = new Hero("畑中",6500,6500,180,200);
		Hero h10 = new Hero("村田",4000,4000,120,100);
		
		
		
		do {
			h5.attack(h1);
		}while(h1.hp>0); //なんで無限ループ？
		
		System.out.println();
		
	}

}
