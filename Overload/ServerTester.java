public class ServerTester{


public static void main(String[] connections)
{
	System.out.println("JVM invoked main");	
	System.out.println("main method args length"+connections.length);	
        
		String name="TCP";
		Server.client(name);

		Server.client(name,2);
		
		Server.client(name,80);


	System.out.println("EXIT :: main");	
}

}
