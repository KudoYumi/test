package 使われる側;

class A implements Inter{

	@Override
	public String hello(String name) {
		return "hello,"+name;
	}
}
