import java.util.Scanner;
public class DoWhileTest
{
public static void main(String[] a)
{
Scanner i= new Scanner(System.in);
System.out.println("How many greetings do you want");
int N=i.nextInt();
do
{
System.out.println("Hello");
N--;
}
while(N > 0);
}
}




