import java.util.Scanner;
public class ReverseArray{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("How many number do youwant to enter?");
		int number=input.nextInt();
		input.nextLine();

         //input from user
		int[] originalArray=new int[number];
		System.out.println("enter a number:");


		for(int i=0;i<number;i++){
		    originalArray[i]=input.nextInt();

	    }
	    System.out.print("originsl array:");

	    for(int i=0;i<number;i++){
	    	
	    	System.out.print(originalArray[i]+" ");

	    }
	    int start=0;
	    int end=originalArray.length-1;
	    while(start<end){
	    	int temp=originalArray[start];
	    	originalArray[start]=originalArray[end];
	    	originalArray[end]=temp;
	    	start++;
	    	end--;
	    }
	    System.out.println("\n\nReverse array:");
	    for(int i=0;i<number;i++){
	    	System.out.print(originalArray[i]+" ");
	    }
	    

		input.close();

	}

	
}