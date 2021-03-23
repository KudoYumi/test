package 紫本5_10;

public class Boo {
	private String msg;

	public Boo(String m) {
		msg = m;
	}
	public void setMsg(String m) {
		msg = m;
	}
	public String getMsg() {
		return msg;
	}

	public Goo useGoo(Goo g) {
		setMsg(g.getMsg());
		return g;
	}
}
