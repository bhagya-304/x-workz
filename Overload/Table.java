public class Server
{
	
	
	public static void client(String socket)
	{
		
		System.out.println("invoked client");
		System.out.println("arg socket: "+socket);
		
	}
	//chnage in parameter
	//no of parameters
	//change in data type of the parameters
	//change in sequence of parameters
	public static void client(String address,String IpPort)
	{
		System.out.println("invoked client with two parameters ");
		System.out.println("String and String");
		System.out.println("arg1 address"+address);
		System.out.println("arg2 IpPort"+IpPort);
		
	}
	
	public static void client(String address,int IpPort)
	{
		
		System.out.println("invoked client with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 address"+address);
		System.out.println("arg2 IpPort"+IpPort);
	}
	
	public static void client(int IpPort,String address)
	{
		System.out.println("invoked client with two parameters ");
		System.out.println("int and String");
		System.out.println("arg1 IpPort"+IpPort);
		System.out.println("arg2 address"+address);
		
	}
	
	
	
}
