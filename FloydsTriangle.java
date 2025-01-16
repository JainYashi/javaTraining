import java.util.Scanner;
public class FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int row=scn.nextInt();
		int c=1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(c +" ");
				c++;
			}
			System.out.println();
		}

	}

}
