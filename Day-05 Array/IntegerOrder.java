import java.util.Scanner;
public class IntegerOrder{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		int[] numbers=new int[6];
		for(int i=0;i<numbers.length;i++){
			numbers[i]=input.nextInt();
		}
		for(int i=0;i<numbers.length-1;i++){
			for(int j=0;j<numbers.length-1-i;j++){
				if(numbers[j]>numbers[j+1]){
					int temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;

				}
			}
		}
		System.out.println("the originsl array");
		for(int i=0;i<numbers.length;i++){
			System.out.print(numbers[i]+" ");
		}
		input.close();
	}
	
}