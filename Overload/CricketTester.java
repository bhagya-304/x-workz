public class CricketTester{


public static void main(String[] ground)
{
	System.out.println("JVM invoked main");	
	System.out.println("main method args length"+ground.length);	
        
		String name="ViratKohli";
		Cricket.team(name);

		Cricket.team(name,6);
		
		Cricket.team(name,20);


	System.out.println("EXIT :: main");	
}

}
