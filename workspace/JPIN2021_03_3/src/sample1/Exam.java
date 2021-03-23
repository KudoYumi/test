package sample1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exam implements Iterable<Question>{

	private List<Question> list = new ArrayList<>();

	public void add(Question question) {
		this.list.add(question);
	}

	@Override
	public Iterator<Question> iterator(){
		return this.list.iterator();
	}
}
