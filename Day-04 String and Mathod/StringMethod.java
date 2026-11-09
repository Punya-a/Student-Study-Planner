import java.util.Scanner;
public class StringMethod{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a student name:");
		String student=input.nextLine();
		System.out.println("Enter a subbject name:");
		String subject=input.nextLine();
		System.out.println("Enter a study day:");
		String day=input.nextLine();

		System.out.println("subject name in upper case:"+subject.toUpperCase());
		System.out.println("Length of a name:"+student.length());
	}
}