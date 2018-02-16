
public class TestGreet {

	public static void main(String[] args) {

		Greet[] bob = new Greet[40];
		for(int counter = 0; counter < bob.length; counter ++)
		{
			Greet billy = new Greet();
			bob[counter] = billy;
		}
		for(Greet temp: bob)
		{
			temp.toString();
		}

	}

}
