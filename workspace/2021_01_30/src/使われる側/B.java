package 使われる側;

class B implements Inter{
	@Override
	public String hello(String name) {
		return "Hi,"+name;
	}
}
