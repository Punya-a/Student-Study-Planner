import java.util.Scanner;
public class ArrayProblem{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] arr=new int[6];
		for(int i=0;i<arr.length;i++){
			arr[i]=input.nextInt();
		}
		System.out.println("Original array:");
		for (int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
		int start=0;
		int end=arr.length-1;
		while(start<end){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println("\n reversed array:");
		for (int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
		input.close();
	}
	
}