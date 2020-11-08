public class TheaterTester{
	public static void main(String[] names)
	{
		System.out.println("Invoked main");
		
		TheaterFinder.bestTheaterInHubliUsingString("Rupam");
		String theaterName="SANJOTA";
		Theater enumTheaterName=Theater.valueOf(theaterName);
		TheaterFinder.bestTheaterInHubliUsingEnum(enumTheaterName);
		
		System.out.println("EXIT :: main");
	}
}