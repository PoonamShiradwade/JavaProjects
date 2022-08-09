import java.util.Scanner;

public class Swap2Numbers {
	public static void main(String[] args) {
		// reading value from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A and B :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp;
		
		//assigning value at the time of variable creation
		/*int a=10, temp;
		int b=20;*/
		
		//logic
		temp=a;
		a=b;
		b=temp;
		System.out.println("A is:" +a);
		System.out.println("B is:"+b);
	}

}
