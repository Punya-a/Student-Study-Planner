import java.util.Scanner;
public class StringEqual{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		System.out.println("Enter a name:");
		String name=input.nextLine();

		System.out.println("Enter a subject name:");
		String subject=input.nextLine();

		if(subject.equalsIgnoreCase("java")){
			System.out.println("Subject name is correct");

		}else{
			System.out.println("Sorry! you entered subject was not there");
		}
		input.close();
	}
	
}