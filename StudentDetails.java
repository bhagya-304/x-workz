public class StudentDetails
{
public static void main(String args[])
{
	System.out.println("invoked main method by JVM");
	arrayOfPercentage();
}

public static void arrayOfPercentage()
{
	System.out.println("invoke student percentage");
	float percentageOfBhagya=86.9f;
	float percentageOfAkshata=78.33f;
	float percentageOfAnu=57.9f;
	float percentageOfShree=97.2f;
	float percentageOfNikita=67.0f;
	
	float[] percentage={percentageOfBhagya,percentageOfAkshata,percentageOfAnu,percentageOfShree,percentageOfNikita};
	int sizeOfArray=percentage.length;
	System.out.println("Size of Array is "+sizeOfArray);
	
	float elementAtIndex1=percentage[1];
	System.out.println("percentage of Students :"+elementAtIndex1);
	
	float elementAtIndex4=percentage[4];
	System.out.println("percentage of Students :"+elementAtIndex4);
}
}
