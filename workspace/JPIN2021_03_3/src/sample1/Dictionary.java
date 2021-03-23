package sample1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Dictionary {
	private List<String> list = new ArrayList<String>();

	public void add(String word) {
		this.list.add(word);
	}

	public Exam createExam(int size) {
		Exam exam = new Exam();
		int r = new Random().nextInt(10);

		for(int i=0; i<r; i++) {
			Collections.shuffle(list);
		}

		for(int i=0; i<size; i++) {
			exam.add(new Question(list.get(i)));
		}
		return exam;
	}
}
