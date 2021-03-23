package sample1;

public class Question {
	private String word;
	private boolean complete = false;


	public Question(String word) {
	//	super();
		this.word = word;
	}

	public boolean test(String word) {
		this.complete = this.word.equals(word);
		return this.complete;
	}

	public boolean isComplete() {
		return this.complete;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Question) {
			Question q = (Question)obj;

			if(q.word.equals(this.word)) {
				return true;
			}
		}
		return false;
	}

	public String getWord() {
		return word;
	}

}
