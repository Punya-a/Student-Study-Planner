import java.io.*;
import java.util.Scanner;
public class StudentMark{
	public static void main(String[] args) {
		System.out.println("Enter a marks of student:");
		Scanner input=new Scanner(System.in);
		int sum=0;
		int[] marks=new int[5];

		for(int i=0;i<5;i++){
			//System.out.println("Enter a marks of student:");
			marks[i]=input.nextInt();
			//sum=sum+marks[i];
		}
		System.out.println("Enter a marks:");
		for (int i=0;i<5;i++){
			System.out.print(marks[i]+" ");
			sum=sum+marks[i];
			//System.out.println("The total sum of marks is:"+sum);
		}
		System.out.println("\n "+"The total sum of marks is:"+sum);
		input.close();
	}
	
}