package ラムダ式1;

public class Factory2 {
	public static Inter create() {
		return (name) -> "hello"+name ;
	}

	public static Inter create2() {
		return (String name) -> "Bye"+name ;
	}
}
