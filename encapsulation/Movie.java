public class Movie
{
	
	private  static String acting="Dilouge";
	
	//getter
	public static String getActing()
	{
		
		return acting;
	}
	
	
	//setter
	public static void setActing(String newActing)
	{
		
		if(newActing.equals("Hero") || newActing.equals("HeroIn") || newActing.equals("Villain"))	//compare the string 		
		{
			System.out.println("new acting is "+newActing);
			acting=newActing;
		}
		else{
			System.out.println("you cannot change the acting");
		}
		
	}
}