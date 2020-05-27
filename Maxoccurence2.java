import java.util.*;
import java.io.*;
public class Maxoccurence2
{
	public static void main(String[] args) {
	   Scanner in = new Scanner (System.in);
	   int size=10;
	   int arr []= new int [10];
	   int i,j,count=0;
	   for (i=0;i<size;i++)
	        arr[i]=in.nextInt();
	    int max = arr[0];
	   for (i=1;i<size;i++)
	        if (max<arr[i])
	            max=arr[i];
	   for (i=0;i<size;i++)
	        if (max==arr[i])
	            count++;
	   System.out.println ("Maximum Value is "+  max  + " and it occured " + count + " times");
	}
}