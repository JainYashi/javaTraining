import java.util.Scanner;
class SimpleCalc{
	public int add(int num1,int num2) {
		return num1+num2;
	}
	public int subtract(int num1,int num2) {
		return num1-num2;
	}
	public int multiply(int num1,int num2) {
		return num1*num2;
	}
	public double divide(int num1,int num2) {
		if(num2==0) {
			System.out.println("denominator can't be zero");
			return -1;
		}
			
		return (double)num1/(double)num2;
	}
	public int modulus(int num1,int num2) {
		return num1%num2;
	}
	public int maximum(int num1,int num2) {
		return Math.max(num1, num2);
	}
	public int minimum(int num1,int num2) {
		return Math.min(num1, num2);
	}
	public double average(int num1,int num2) {
		return (double)(num1+num2)/2.0;
	}


}
public class Exercise3E {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int num1=scn.nextInt();
		int num2=scn.nextInt();
		SimpleCalc obj=new SimpleCalc();
		System.out.println("Sum of two numbers :" +obj.add(num1,num2));
		System.out.println("Subtraction :" +obj.subtract(num1,num2));
		System.out.println("Multiplication :" +obj.multiply(num1,num2));
		System.out.println("Division :" +obj.divide(num1,num2));
		System.out.println("Modulus :" +obj.modulus(num1,num2));
		System.out.println("Maximum :" +obj.maximum(num1,num2));
		System.out.println("Minimum :" +obj.minimum(num1,num2));
		System.out.println("Average :" +obj.average(num1,num2));
		
scn.close();
	}

}
