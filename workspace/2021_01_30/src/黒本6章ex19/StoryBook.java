package 黒本6章ex19;

import 黒本6章ex19_ohter.Book;

public class StoryBook extends Book{
	public static void main(String[] args) {
		StoryBook story = new StoryBook();
		story.setIsbn("xxx-xxx");
		story.printInfo();

		Book book = new StoryBook();
		book.setIsbn("yyy-yyy");
//		book.printInfo(); Book型として見てるから、アクセス不可。
	}
}
