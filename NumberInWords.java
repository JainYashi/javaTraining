import java.util.HashMap;
import java.util.Scanner;
public class NumberInWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,String> hash=new HashMap<>();
		hash.put('0',"zero");
		hash.put('1',"one");
		hash.put('2',"two");
		hash.put('3',"three");
		hash.put('4',"four");
		hash.put('5',"five");
		hash.put('6',"six");
		hash.put('7',"seven");
		hash.put('8',"eight");
		hash.put('9',"nine");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		String s=Integer.toString(n);
		for(int i=0;i<s.length();i++) {
			System.out.print(hash.get(s.charAt(i)) + " ");
		}
		System.out.println();

	}

}
