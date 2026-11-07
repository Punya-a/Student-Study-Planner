import java.util.Scanner;
public class StudentStudyHourCalculator{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number of days studied:");
		int days=input.nextInt();
		double totalHours=0;

		for(int i=1; i<=days; i++){
			System.out.print("Enter a study hours for day:"+i+":");

			double studyHours=input.nextDouble();
			totalHours=totalHours+studyHours;
		}
		System.out.println("=======Study summary====");
		System.out.println("Total study hours:"+totalHours);
		double averageHours=totalHours/days;
		System.out.println("Average study time:"+averageHours);
		input.close();
	}
	
}