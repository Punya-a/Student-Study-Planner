import java.util.Scanner;
public class StudentPassFailChecker{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enetr a Name:");
		String name=input.nextLine();
		System.out.println("Enetr a marks:");
		int marks=input.nextInt();
		input.nextLine();

		System.out.println("Student name is:"+name);
		System.out.println("Student marks:"+marks);
		System.out.println("-------STUDENT RESULT------");

		if(marks>35){
			System.out.println("Congratualatin! you have Pass");
		}
		else{
			System.out.println("Sorry you are Failed");
		}
	}
	

}