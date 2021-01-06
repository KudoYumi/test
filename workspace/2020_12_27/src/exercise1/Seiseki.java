package exercise1;

class Seiseki {
	private String number;
	private String name;
	private int[] score;
	private boolean attend;

	public Seiseki(String number, String name, int[] score, boolean attend) {
	//	super();
		this.number = number;
		this.name = name;
		this.score = score;
		this.attend = attend;
	}

	/**
	 * @return number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number セットする number
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return score
	 */
	public int[] getScore() {
		return score;
	}

	/**
	 * @param score セットする score
	 */
	public void setScore(int[] score) {
		this.score = score;
	}

	/**
	 * @return attend
	 */
	public boolean getAttend() {
		return attend;
	}

	/**
	 * @param attend セットする attend
	 */
	public void setAttend(boolean attend) {
		this.attend = attend;
	}


}
