package ラムダ式1;

public class Factory {
	public static Inter create() {
		return new Inter() {
			@Override
			public String hello(String name) {
				return "hello"+name ;
			}
		};
	}
}
