import java.util.Scanner;
public class IntegerCategory{
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner input=new Scanner(System.in);

		int positiveInteger=0;
		int negativeInteger=0;
		int zeroInteger=0;

		int[] numbers=new int [8];
		for(int i=0;i<numbers.length;i++){
			numbers[i]=input.nextInt();

		}
		System.out.println("The original array is:");
		for (int i=0;i<numbers.length ;i++ ) {
			System.out.print(numbers[i]+" ");
			if(numbers[i]>0){
				positiveInteger++;
			}else if(numbers[i]<0){
				negativeInteger++;
			}else{
				zeroInteger++;
			}
			/**System.out.println(numbers[i]);
			System.out.println("The positiveInteger is :"+positiveInteger);
			System.out.println("The negativeInteger is :"+negativeInteger);
			System.out.println("The zeroInteger is :"+zeroInteger);*/
	
		}
		System.out.println("\n The positiveInteger is :"+positiveInteger);
		System.out.println("The negativeInteger is :"+negativeInteger);
		System.out.println("The zeroInteger is :"+zeroInteger);
		input.close();
	}
	
}