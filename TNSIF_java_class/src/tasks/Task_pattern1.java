package tasks;
import java.util.Scanner;

public class Task_pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=scan.nextInt();
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
				
				

	}

}
