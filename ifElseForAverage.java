import java.util.Scanner;
public class ifElseForAverage{
public static void main (String [] args){

Scanner markAverage=new Scanner(System.in);

System.out.println("enter your name below:");
String n1=markAverage.nextLine();

System.out.println("enter your Mathmatic mark below:");
int m1=markAverage.nextInt();

System.out.println("enter your English mark below:");
int m2=markAverage.nextInt();

System.out.println("enter your Biology mark below:");
int m3=markAverage.nextInt();

System.out.println("enter your chemistry mark below:");
int m4=markAverage.nextInt();

System.out.println("enter your physic mark below:");
int m5=markAverage.nextInt();

int m6=m1+m2+m3+m4+m5;

System.out.println(n1+"'s marks is "+m6);

int m7=((m1+m2+m3+m4+m5)/5);
System.out.println(n1+"'s average mark is "+m7 );


if (m7>=90){
System.out.println("Excellent");}

else if (m7>=80 && m7<=90){
System.out.println("Very good");}

else if (m7>=70  && m7<=80){
System.out.println("Good");}

else if (m7>=60 && m7<=70){
System.out.println("Not bad");}

else {
System.out.println("Passed");}

}}