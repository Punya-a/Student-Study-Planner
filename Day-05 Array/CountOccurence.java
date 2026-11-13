import java.util.Scanner;
public class CountOccurence{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int count=0;

		System.out.println("Enter a array number:");
		int[] arr=new int[7];

		for(int i=0;i<arr.length;i++){
			arr[i]=input.nextInt();
		}
		int search=input.nextInt();
		System.out.println("Enter a search element is:"+search);
		//int search=input.nextInt();

		for(int i=0;i<arr.length;i++){
			if(arr[i]==search){
				count++;
			}
		}

		System.out.println("The search element is "+search+ "occured at " +count+ "times");
		input.close();

	}
	
}