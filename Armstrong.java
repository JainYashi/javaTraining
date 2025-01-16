import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
public static boolean check(int n) {
	int num=n;
	int s=0;
	String str=Integer.toString(n);
	int ct=str.length();
	while(n!=0) {
		int a=n%10;
		s+=(Math.pow(a, ct));
		n=n/10;
	}
	//System.out.println(s);
	if(s==num)
    return true;
	else
		return false;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6
		/*Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(check(n));*/
		
		//7
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		for(int i=1;i<=n;i++) {
			if(check(i))
				System.out.println(i);
		}
	
			
	}

}
