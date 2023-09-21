package tasks;
public class Task4 {
	public static void main(String[] args) {
		int n=10,m=30,k=3,sum=0,j=0,l=0;
		for(int i=10;i<=m;i++) {
			j=i%10;
			l=i/10;
			sum=j+l;
			if(sum==k) {
				System.out.println(i);
			}
			
		}
	}
}