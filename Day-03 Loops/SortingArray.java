import java.util.Scanner;
public class SortingArray{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		System.out.println("How many subject have?");
		int noOfSubject=input.nextInt();
		input.nextLine();

		//String[] subject=new String[noOfSubject];
		double[] marks=new double[noOfSubject];

		for(int i=0;i<noOfSubject;i++){
			System.out.print("enter a marks:"+(i+1)+":");
			marks[i]=input.nextDouble();
		}

		for(int i=0;i<noOfSubject-1;i++){
			for(int j=0;j<noOfSubject-1-i;j++){
				if(marks[j]>marks[j+1]){
					double temp=marks[j];
					marks[j]=marks[j+1];
					marks[j+1]=temp;
				}
			}
		}
		System.out.println("\n Marks in ascending order");
		for(int i=0;i<noOfSubject;i++){
			System.out.println(marks[i]);
	    }
	    for(int i=0;i<noOfSubject-1;i++){
			for(int j=0;j<noOfSubject-1-i;j++){
				if(marks[j]<marks[j+1]){
					double temp=marks[j];
					marks[j]=marks[j+1];
					marks[j+1]=temp;
				}
			}
		}
		System.out.println("\n Marks in descending order");
		for(int i=0;i<noOfSubject;i++){
			System.out.println(marks[i]);
	    }


		input.close();
	}
	
}