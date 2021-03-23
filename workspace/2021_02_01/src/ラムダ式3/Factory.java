package ラムダ式3;

public class Factory {
	public static Inter show() {
		return (name,age) -> name+"ちゃんは"+age+"歳";
	}
}
