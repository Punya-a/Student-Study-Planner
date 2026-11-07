import java.util.Scanner;
public class ArraySearch{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		System.out.println("Enter how many subject are there? :");
		int noOfSubject=input.nextInt();
		input.nextLine();



		String[] subjects=new String[noOfSubject];
		for(int i=0;i<noOfSubject;i++){
			System.out.print("Name of the subject:");
			subjects[i]=input.nextLine();
		}
		System.out.println("which subject do you want to search:");
		String searchSubject=input.nextLine();

		boolean found=false;

		for(int i=0;i<noOfSubject;i++){
			if(searchSubject.equalsIgnoreCase(subjects[i])){
				System.out.println("The searched elemnt in the index:"+(1+i));
				found=true;
				break;
			}
		}
		if(!found){
			System.out.println("The searched element not found");
		}
		input.close();
		
	}
	
}