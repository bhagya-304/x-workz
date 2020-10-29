public class Cricket
{
	
	
	public static void team(String players)
	{
		
		System.out.println("invoked team");
		System.out.println("arg players: "+players);
		
	}
	//chnage in parameter
	//no of parameters
	//change in data type of the parameters
	//change in sequence of parameters
	public static void team(String captain ,String noOfOvers)
	{
		System.out.println("invoked team with two parameters ");
		System.out.println("String and String");
		System.out.println("arg1 captain"+captain);
		System.out.println("arg2 noOfOver"+noOfOvers);
		
	}
	
	public static void team(String captain,int noOfOvers)
	{
		
		System.out.println("invoked team with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 captain"+captain);
		System.out.println("arg2 noOfOvers"+noOfOvers);
	}
	
	public static void team(int noOfOvers,String captain)
	{
		System.out.println("invoked team with two parameters ");
		System.out.println("int and String");
		System.out.println("arg1 noOfOvers"+noOfOvers);
		System.out.println("arg2 captain"+captain);
		
	}
	
	
	
}