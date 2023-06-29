import java.util.Scanner;
public class Calci2 {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers:");
	float n=sc.nextInt();
	float m=sc.nextInt();
	
	System.out.println("Enter 1=* 2=- 3=+ 4=/ 5=%");
	int Choice=sc.nextInt();
	
	switch(Choice) {
	case 1:
		System.out.println("Multiplication of two numbers is "+(n*m));
		break;
	
	case 2:
		System.out.println("Subtraction of two numbers is "+(n-m));
		break;
		
	case 3:
		System.out.println("Addition of two numbers is "+(n+m));
		break;
		
	case 4:
		System.out.println("Division of two numbers is "+(n/m));
		break;
		
	case 5:
		System.out.println("Modulus of number is "+(n%m));
		break;
		
	default:
		System.out.println("Wrong choice!!");
	}
	
	
}}