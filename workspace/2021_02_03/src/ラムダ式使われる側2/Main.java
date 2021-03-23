package ラムダ式使われる側2;

public class Main {
	public static void main(String[] args) {
		Mother m = (name,age)->
						{return "hello"+age+"歳の"+name+"さん";};

		System.out.println(m.prof("パン吉",0));
	}
}
