
public class Recursion {


	public void m1 () {
		m2();
	}

	public void m2 () {
		m3();
	}

	public void m3 () {
		m1();
	}
}
