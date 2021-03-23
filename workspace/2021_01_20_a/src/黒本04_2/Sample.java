package 黒本04_2;

public class Sample {
	int num = 10;

	Sample(){

		this("わたし");

		System.out.print("引数なしコンストラクタ起動:");
		System.out.println(num);
	}

	//初期化ブロック
	{
		System.out.println("初期化ブロック起動");
		num++;
		System.out.println("numが"+num+"になった");
	}

	Sample(String val){
		System.out.print("引数ありのコンストラクタ起動:");
		System.out.println(val+"の年齢は"+num);
	}


}
