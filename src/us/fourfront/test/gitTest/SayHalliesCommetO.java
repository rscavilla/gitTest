package us.fourfront.test.gitTest;

public class SayHalliesCommetO {

	public SayHalliesCommetO() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String[] greeting = new String[2];
		greeting[0] = "Hallies Commet O!";
		greeting[1] = " Now let's add a change to see how Git works";
		sayIt(greeting);
	}

	private static void sayIt(String[] msg) {// testing SVN
		System.out.println(mergeMsg(msg));
	}
	
	private static String mergeMsg(String[] msg) {
		return msg[0] + msg[1];
	}
}
