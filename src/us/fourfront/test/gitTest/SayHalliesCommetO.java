package us.fourfront.test.gitTest;

public class SayHalliesCommetO {

	public SayHalliesCommetO() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String greeting = "Hallies Commet O!";
		greeting += " Now let's add a change to see how Git works";
		sayIt(greeting);
	}

	private static void sayIt(String msg) {// testing SVN
		System.out.println(msg);
	}
}
