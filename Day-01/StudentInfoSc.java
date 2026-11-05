import java.util.Scanner;
public class StudentInfoSc{
	public static void main(String[]args){

		Scanner scanner=new Scanner(System.in);

	System.out.println("Enetr student name:");
	String studentName=scanner.nextLine();

	System.out.println("enetr a current semester:");
	int semester=scanner.nextInt();
	scanner.nextLine();

	System.out.println("eneter Subject name:");
	String subjectName=scanner.nextLine();

	System.out.println("Enter daily study hours:");
	int studyHour=scanner.nextInt();
	//scanner.nextLine();

	//disply

	System.out.println("Student NAme:"+studentName);
	System.out.println("semester:"+semester);
	System.out.println("Subject name:"+subjectName);
	System.out.println("Study hours:"+studyHour);

	scanner.close();
	}
}