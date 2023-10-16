package tasks;
import java.util.Scanner;
public class Task_pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=scan.nextInt();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || j==1|| j== 5 || i==5) {
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
