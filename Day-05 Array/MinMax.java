import java.util.Scanner;
public class MinMax{
	public static void main(String[] args) {
		System.out.println("enter a marks:");
		Scanner input=new Scanner(System.in);
		/**int highest=marks[0];
		int smallest=marks[0];*/
		int[] marks=new int[5];

		for(int i=0;i<marks.length;i++){
			marks[i]=input.nextInt();
		}
		int largest =marks[0];
		int smallest=marks[0];
		for(int i=1;i<marks.length;i++){
		if(marks[i]>largest){
			largest=marks[i];
		}
		//System.out.println("The highest marks:"+largest);

		if(marks[i]<smallest){
			smallest=marks[i];
		}
	}
			System.out.println("The highest marks:"+largest);

			System.out.println("The lowest marks is:"+smallest);
			System.out.println("The marks is:");

		
		for (int i=0;i<marks.length;i++){
			System.out.print(marks[i]+" ");
		}

		input.close();
	}
}