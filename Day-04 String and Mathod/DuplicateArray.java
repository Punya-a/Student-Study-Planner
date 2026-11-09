import java.util.Scanner;
public class DuplicateArray{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a how many numbers?:");
		int number=input.nextInt();

		int[] array=new int[number];
		for(int i=0;i<number;i++){
			System.out.println("enter a number:");
			array[i]=input.nextInt();
		}
		for(int i=0;i<number;i++){



	        for(int j=i+1;j<number;j++){


			    if(array[i]==array[j]){


				    System.out.println("Dublicate number:"+array[i]);
				    break;
				}

			}
		}
		input.close();

	}
	
}