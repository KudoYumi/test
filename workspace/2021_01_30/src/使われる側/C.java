package 使われる側;

class C implements Inter{
	@Override
	public String hello(String name) {
		return "こんにちは,"+name;
	}
}
