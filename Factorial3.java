import java.util.*;
import java.io.*;
public class Factorial3
{
	public static void main(String[] args) {
	   Scanner in = new Scanner (System.in);
	   int n;
	   int i,fact=1;;
	   n=in.nextInt ();
	   for (i=2;i<=n;i++)
	        fact*=i;
	   System.out.println ("Factorial is "+ fact);
	}	   
}
