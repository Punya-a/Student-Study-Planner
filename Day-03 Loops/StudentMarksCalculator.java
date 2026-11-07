import java.util.Scanner;
public class StudentMarksCalculator{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("How many subject are there?:");
		int subject=input.nextInt();
		input.nextLine();
		
		String[] subjects=new String[subject];
		

		int[] marks=new int[subject];
		double totalMarks=0;
		for(int i=0;i<subject;i++){
			
			System.out.print("enter a subject name:");
			subjects[i]=input.nextLine();
			System.out.print("enter a marks:");
			marks[i]=input.nextInt();
			input.nextLine();

			
			totalMarks=totalMarks+marks[i];
		}

	    double averageMarks=totalMarks/subject;
	    for(int i=0;i<subject;i++){
			//System.out.println(subjects[i]+":"+marks[i]);
		}
	    System.out.println("The average marks is a:"+averageMarks);	
	    System.out.println("The total marks is:"+totalMarks);
	    input.close();


	}
}