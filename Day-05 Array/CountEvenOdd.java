import java.util.Scanner;
public class CountEvenOdd{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int countEven=0;
		int countOdd=0;
		System.out.println("Enter a number:");

		int[] count=new int[8];
		for(int i=0;i<count.length;i++){
			//System.out.println("Enter a number:");
			count[i]=input.nextInt();
		}
		for(int i=0;i<count.length;i++){
			System.out.println(count[i]);


		    if(count[i]%2==0){
			    countEven++;
			//System.out.println("Even count number:"+countEven);

		    }else{
			    countOdd++;
			//System.out.println("Odd count number:"+countOdd);
		    }
	    }
		
		
			System.out.println("Even count number:"+countEven);
			System.out.println("Odd count number:"+countOdd);
		    input.close();
	}
}