public class WeeklyStudyCalculator{
	public static void main(String[]args){
	int monday=2;
	int tuesday=3;
	int wednesday=1;
	int thursday=2;
	int friday=3;
	int total=monday+tuesday+wednesday+thursday+friday;
	double average=total/5.0;
	int difference=3-1;

	System.out.println("WEEKLY STUDY CALCULATOR");
	System.out.println("Monday:"+monday +"hour");
	System.out.println("Tuesday:"+tuesday);
	System.out.println("Wednesday:"+wednesday);
	System.out.println("Thursday:"+thursday);
	System.out.println("Friday:"+friday);
	System.out.println("Total study hour:"+total);
	System.out.println("Average hours:"+average);
	System.out.println("Difference:"+difference);
	}
}