import java.util.Scanner;
public class SecondLargest{
	public static void main(String[] args) {
		System.out.println("Enter a numbers:");
		Scanner input=new Scanner(System.in);

		int largest=Integer.MIN_VALUE;
		int secoundLargest=Integer.MIN_VALUE;
		int[] numbers=new int[6];

		for(int i=0;i<numbers.length;i++){
			numbers[i]=input.nextInt();
		}
		System.out.println("Original array is:");
		for(int i=0;i<numbers.length;i++){
			System.out.print(numbers[i]+" ");
			if(numbers[i]>largest){
				secoundLargest=largest;
				largest=numbers[i];
			}else if(numbers[i]>secoundLargest && numbers[i]<largest){
				secoundLargest=numbers[i];
			}
		}
		if(secoundLargest==Integer.MIN_VALUE){
				System.out.println("THE secoundLargest Integer not found");
			}
		System.out.println("\n The largest element is:"+largest);
		System.out.println("The secoundLargest elementis:"+secoundLargest);
		input.close();
	}

	
}