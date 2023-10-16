package tasks;
import java.util.Scanner;
public class Task4 {
	public static void main(String[] args) {
		
		int sum=0,j=0,l=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n=scan.nextInt();
		int m=scan.nextInt();
		int k=scan.nextInt();	
		for(int i=n;i<=m;i++) {
			j=i%10;
			l=i/10;
			sum=j+l;
			if(sum==k) {
				System.out.println(i);
			}
			
		}
	}
}