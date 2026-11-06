import java.util.Scanner;
public class StudentGradeCalculator{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		System.out.println("Enter student full name:");
		String name=input.nextLine();
		System.out.println("Enetr examination marks:");
		int marks=input.nextInt();
		input.nextLine();

		System.out.println("=======STUDENT RESULT=========");

		System.out.println("Student name:"+name );
		System.out.println("Examination marks:"+marks);

		

		if(marks >= 0 &&  marks <= 100){
			if(marks >= 90){
				System.out.println("Grade: A+");
			}
			else if(marks >= 80 && 89 <= marks){
				System.out.println("Grade: A");
			}
			else if(marks >= 70 && 79 <= marks){
				System.out.println("Grade: B");
			}
			else if(marks >= 60 && 69 <= marks){
				System.out.println("Grade: C");
			}
			else if(marks >= 35 && 59 <= marks){
				System.out.println("Grade: D");
			}
			else{
				System.out.println("Fail");
			}

		}
		else{
			System.out.println("Invalid marks! Please enter marks between 0 and 100");
		}
		input.close();
		
	}
	
}