public class Boolean
{
public static void main(String[] args)
{
	System.out.println("invoked by main method");
	exampleForBoolean();
}
public static void exampleForBoolean()
{
	System.out.println("invoke method exampleForBoolean");
	boolean flag=true;
	boolean earthIsFlat=false;
	boolean roseIsRed=true;
	
	boolean[] trueOrFalse={flag,earthIsFlat,roseIsRed};
	int sizeOfArray=trueOrFalse.length;
	System.out.println("size of array :"+sizeOfArray);
	
	boolean elementAtIndex1=trueOrFalse[1];
	System.out.println("Element at index one :"+elementAtIndex1);
}
}