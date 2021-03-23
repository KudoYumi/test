package sample1;

import java.util.Scanner;

public class Typing {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary();
		dic.add("int");
		dic.add("long");
		dic.add("float");
		dic.add("double");
		dic.add("char");
		dic.add("boolean");
		dic.add("byte");
		dic.add("short");

		Exam exam = dic.createExam(3);
		Scanner scan = new Scanner(System.in);

		for(Question q : exam) {
			System.out.println(q.getWord()+">");
			String input = scan.nextLine();
			q.test(input);
			System.out.println();
		}
		scan.close();

		System.out.println("---");
		for(Question q : exam) {
			System.out.println(q.getWord()+":"+q.isComplete());
		}
	}
}
