public class MovieTester{
	
	
public static void main(String[] actT)
{
System.out.println("JVM invoked main");

String actingValue=Movie.getActing();

System.out.println("actingValue"+actingValue);

Movie.setActing("HeroIn");

actingValue=Movie.getActing();

System.out.println("actingValue"+actingValue);

System.out.println("EXIT :: main");

}
	
}