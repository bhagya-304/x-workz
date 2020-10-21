public class Laptop
{
public static void main(String[] args){
System.out.println("invoked main method by JVM");
arrayOfEmails();
System.out.println("existing main method by JVM");
}
public static void arrayOfEmails()
{
	System.out.println("invoked array of emails");
	String contactEmail="contact@X-workz.in";
	String subscribeEmail="subscribe@X-workz.in";
	String hrEmail="vinay@x-workz.in";
	
	String[] emails={contactEmail,subscribeEmail,hrEmail};
	int sizeOfArray=emails.length;
	System.out.println("Total elements "+sizeOfArray);
	
	String elementAtIndex1=emails[1];
	System.out.println("Element at index one "+elementAtIndex1);
	
	String elementAtIndex2=emails[2];
	System.out.println("Element at index two "+elementAtIndex2);
	
	
	
}
}