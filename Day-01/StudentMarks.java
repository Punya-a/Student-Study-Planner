import java.util.Scanner;
public class StudentMarks{
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		System.out.println("eneter a name:");
		String studentName=scanner.nextLine();

		System.out.println("eneter a cgpa:");
		float cgpa=scanner.nextFloat();
		scanner.nextLine();

		//display

		System.out.println("Student name:"+studentName);
		System.out.println("CGPA:"+cgpa);



		scanner.close();


			}
}