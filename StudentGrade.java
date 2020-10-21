public class StudentGrade
{
public static void main(String[] args)
{
	System.out.println("invoked method by JVM");
	gradeOfStudents();
}
public static void gradeOfStudents()
{
	System.out.println("Student Grades");
	char gradeOfBhagya='S';
	char gradeOfBavya='B';
	char gradeOfGeeta='A';
	char gradeOfRita='C';
	char gradeOfMeera='S';
	
	
	char[] grades={gradeOfBhagya,gradeOfBavya,gradeOfGeeta,gradeOfRita,gradeOfMeera};
	int sizeOfArray=grades.length;
	System.out.println("Size of array "+sizeOfArray);
	
	char elementAtIndex2=grades[2];
	System.out.println("Grades of student :"+elementAtIndex2);
	
	char elementAtIndex5=grades[5];
	System.out.println("Grades of student :"+elementAtIndex5);
	
	char elementAtIndex4=grades[4];
	System.out.println("Grades of student :"+elementAtIndex8);
	
	char elementAtIndex0=grades[0];
	System.out.println("Grades of student :"+elementAtIndex0);
	
	
}
}
