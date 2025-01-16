import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4
		/*Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int s=0;
		for(int i=1;i<=n;i++) {
			s+=i;
		}
		System.out.println(s);	*/	
		
		//5
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int s=0;
		while(n!=0) {
			s+=(n%10);
			n=n/10;
		}
		System.out.println(s);	

	}

}
