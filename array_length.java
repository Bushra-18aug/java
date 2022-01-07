public class array_length
{
public static void main (String []args)
{
	double k = 3%6;
	System.out.println(k);
int[] a = {0, 2, 4, 1, 3};
for (int i = 0; i < a.length; i++)
a[i] = a[(a[i] + 3) % a.length];
for (int i = 0; i < a.length; i++)
System.out.println(a[i]);
}
}