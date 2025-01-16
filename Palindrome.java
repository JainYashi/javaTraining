import java.util.Scanner;
public class Palindrome {

	public static boolean check(int n) {
		int num=n;
		int s=0;
		while(n!=0) {
			int a=n%10;
			s=s*10+a;
			n=n/10;
		}
		if(s==num)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//9
		/*Scanner scn =new Scanner(System.in);
		int n=scn.nextInt();
        System.out.println(check(n));*/
		
		//10
		Scanner scn =new Scanner(System.in);
		int n=scn.nextInt();
		for(int i=1;i<=n;i++) {
			if(check(i))
				System.out.println(i);
		}
        
	}

}
