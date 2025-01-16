import java.util.Scanner;
public class PyramidTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//15
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<2*n-1;j++) {
				if(j>=i && j<=2*(n-1)-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
