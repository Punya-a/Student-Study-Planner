import java.util.Scanner;
public class MarksCalculator{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter how many subject:");
		int noOfSubject=input.nextInt();
		input.nextLine();

		String[] subject=new String[noOfSubject];
		int[] marks=new int[noOfSubject];
		for(int i=0; i<noOfSubject;i++){
			System.out.println ("Enter a subject name:");
			subject[i]=input.nextLine();
			System.out.println("Enter a marks:");
			marks[i]=input.nextInt();
			input.nextLine();
		}
		for(int i=0; i<noOfSubject;i++){
			System.out.println("subjectname:"+subject[i]+"and marks:"+marks[i]);
		}
		int highest=marks[0];
		int lowest=marks[0];

		String highestSubject=subject[0];
		String lowestSubject=subject[0];

		for(int i=1 ; i<noOfSubject;i++){



		    if(marks[i]>highest){
			    highest=marks[i];
			    highestSubject=subject[i];

		    }

		    if(marks[i]<lowest){
			    lowest=marks[i];
			    lowestSubject=subject[i];

		    }
		    System.out.println("Highest marks is:"+highest);
		    System.out.println("Hight marks getted subject:"+highestSubject);
		    System.out.println("lowest marks is:"+lowest);
		    System.out.println("Lowest marks getted subject is:"+lowestSubject);
	    }
	    input.close();	
	}
	
}