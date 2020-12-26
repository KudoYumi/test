package code17_12;

public class Main {

	public static void main(String[] args) {
		try {
			throw new UnsupportedMusicFileException("未対応ファイルです");
			// throw文で	強制的にエラーを発生

		}catch(Exception e){
			e.printStackTrace();

		}
	}

}
