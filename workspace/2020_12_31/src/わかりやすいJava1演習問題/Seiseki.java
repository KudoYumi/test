package わかりやすいJava1演習問題;

class Seiseki {

	private String number;
	private String name;
	private int[] score;
	private boolean attend;

	public Seiseki(String number,String name,int[] score,boolean attend) {
		this.number = number;
		this.name = name;
		this.score = score;
		this.attend = attend;
	}


	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getScore() {
		return score;
	}

	public void setScore(int[] score) {
		this.score = score;
	}

	public boolean getAttend() {
		return attend;
	}

	public void setAttend(boolean attend) {
		this.attend = attend;
	}


}
