public class TheaterFinder{
	public static void bestTheaterInHubliUsingString(String theaterName)
	{
		System.out.println("Invoked bestTheaterInHubliUsingStringUsingString");
		System.out.println("arg 1 theaterName:"+theaterName);
		switch(theaterName)
		{
			case "SANJOTA":
				System.out.println("case is:"+theaterName);
				System.out.println("Booked on sunday");
				System.out.println("cost is 300");
				break;
			case "Rupam":
				System.out.println("case is:"+theaterName);
				System.out.println("Booked on thursday");
				System.out.println("cost is 120");
				break;
			case "Apsara":
				System.out.println("case is:"+theaterName);
				System.out.println("Booked on friday");
				System.out.println("cost is 170");
				break;
			case "Sangam":
				System.out.println("case is:"+theaterName);
				System.out.println("Booked on saturday");
				System.out.println("cost is 200");
				
				break;
			default:
				System.out.println("No Theater found");
		}
		System.out.println("EXIT :: bestTheaterInHubliUsingString");
	}	
	public static void bestTheaterInHubliUsingEnum(Theater theaterName)
	{
		System.out.println("invoked bestTheaterInHubliUsingEnum");
		System.out.println("arg 1 theaterName:"+theaterName);	
		switch(theaterName)
		{
			case SANJOTA:
				System.out.println("case is:"+theaterName);
				System.out.println("cost is 300");
				break;
			case RUPAM:
				System.out.println("case is:"+theaterName);
				System.out.println("cost is 120");
				break;
			case APSARA:
				System.out.println("case is:"+theaterName);
				System.out.println("cost is 170");
				break;
			case SANGAM:
				System.out.println("case is:"+theaterName);
				System.out.println("cost is 200");
				break;		
			default :
				System.out.println("no theater found");
		}
		System.out.println("EXIt:: bestTheaterInHubliUsingEnum");
	}
}