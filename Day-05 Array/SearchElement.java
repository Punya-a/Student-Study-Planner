import java.util.Scanner;
public class SearchElement{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//boolean found=false;
		System.out.println("Enter a array elements:");
		int[] arr=new int[7];
		for (int i=0;i<arr.length;i++){
			arr[i]=input.nextInt();
		}
		System.out.println("Enter a number to search:");
		int search=input.nextInt();
		boolean found=false;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==search){
				found=true;
				System.out.println("number found");
			
				System.out.println("Position:"+(i+1));
				break;
			}
		}
		if(!found){
				System.out.println("Number not found");
			}

		/*for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}*/
		input.close();
	}
}