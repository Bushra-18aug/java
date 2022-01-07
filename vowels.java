
      import java.util.Scanner;
      public class vowels{
      public static void main(String [] aaa){


       System.out.println("helloo javaaaa");
// write a complete java program to ask user for two names first name and last name then
        Scanner s1 = new Scanner (System.in);
        System.out.println("enter your name");
        String name1= s1.nextLine();
         System.out.println("enter your father's name");
        String name2= s1.nextLine();

// 1. concatenate the two names and output the names

        String concat2names= name1+name2;
        System.out.println(concat2names);

// 2. length of the concatenate names
        int length= concat2names.length();
        System.out.println(length);
// 3.the last 3 characters of the result
String last3= concat2names.substring(concat2names.length()-3,concat2names.length());
        System.out.println(last3);
// 4. 3rd character of the first name
        char  char3= name1.charAt(2);
        System.out.println(char3);

        int r=0;

        for (int i=0 ; i<concat2names.length() ; i++){

			if(concat2names.charAt (i)=='a' ||  concat2names.charAt (i)=='A' || concat2names.charAt (i)=='i' || concat2names.charAt (i)=='I' || concat2names.charAt (i)=='E' )

			r++;

			}

           System.out.println(r);


String g=concat2names.substring(2);
System.out.println(g);

        }}