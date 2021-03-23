package 黒本4_9;

public class D extends C{
	@Override
	public void hoo() {
		System.out.println("D hoo");
	}

	@Override
	public void hoge() { //あえてpublicに可視性ゆるくしただけ
		System.out.println("D hoge");
	}
}
