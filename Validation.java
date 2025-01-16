import java.util.Scanner;
public class Validation {
static void validateName(String name) {
	/*int i;
	for( i=0;i<name.length();i++) {
		if((name.charAt(i)>='a' && name.charAt(i)<='z') || (name.charAt(i)>='A' && name.charAt(i)<='Z') || (name.charAt(i)>='0' && name.charAt(i)<='9'))
		{}
		else {
			System.out.println("Invalid name");
			break;
		}
	}
	if(i==name.length())
	System.out.println("Name : " + name);*/
	String regex="^[a-zA-Z0-9]+$";
	if(name.matches(regex))
		System.out.println("Name : " +name);
	else
		System.out.println("invalid name");

}
static void validateEmail(String email) {
	String regex="^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$";
	if(email.matches(regex))
		System.out.println("Email : " +email);
	else
		System.out.println("invalid email");

}
static void validateDOB(String date) {
	String regex="^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(\\d{4})$";
	if(date.matches(regex))
		System.out.println("Email : " +date);
	else
		System.out.println("invalid date");

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		String name=scn.next();
		validateName(name);
		String email=scn.next();
		validateEmail(email);
		String date=scn.next();
		validateDOB(date);
	}

}
