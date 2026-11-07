import java.util.Scanner;
public class WeeklyStudyHours{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		System.out.println("how many days?");
		int days=input.nextInt();

		double[] hours=new double[days];
		double totalHours=0;
		for(int i=0; i<days;i++){
			System.out.println("enter a study hour for day:");
			hours[i]=input.nextDouble();
			totalHours=totalHours+hours[i];
		}
		for(int i=0;i<days;i++){
			System.out.println("days"+(i+1)+":"+hours[i]+"hours");
		}
		double averageHours=totalHours/days;
		System.out.println("The total hours is:"+totalHours);
		System.out.println("Average hours is:"+averageHours);

		input.close();
	}
	
}