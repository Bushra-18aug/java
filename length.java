import java.util.Scanner;

public class length{
public static void main(String [] args){

Scanner a = new Scanner (System.in);

System.out.println("enter first name");
  String b = a.nextLine();

System.out.println("enter second name");
  String c = a.nextLine();

  String d = b+c;

  System.out.println(d);

  int g= d.length();

  String h  = d.substring(d.length()-3,d.length());
System.out.println(h);

String y= b.substring(2);
System.out.println(g);

}}
