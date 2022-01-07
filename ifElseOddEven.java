import java.util.Scanner;
public class ifElseOddEven{
public static void main(String [] aaa){

Scanner n=new Scanner(System.in);

System.out.println("enter 4 numbers :");

int odd=0;
int even=0;

int a=n.nextInt();
int b=n.nextInt();
int c=n.nextInt();
int d=n.nextInt();

	if (a%2==0){
	System.out.println(a+" is even number");
	even++;}
		else {
			System.out.println(a+" is odd number");
			odd++;}

	 if (b%2==0){
	System.out.println(b+" is even number");
	even++;}
		else {System.out.println(b+" is odd number");
		odd++;}

	 if (c%2==0){
	System.out.println(c+" is even number");
	even++;}
		else {
		System.out.println(c+" is odd number");
		odd++;}
	if (d%2==0){
	System.out.println(d+" is even number");
	even++;}
		else {
		System.out.println(d+" is odd number");
		odd++;}


    System.out.println("we have " +odd+" odd numbers and "+even+" even numbers");



}
}