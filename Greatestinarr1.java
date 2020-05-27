import java.util.*;
import java.io.*;
public class Greatestinarr1
{
	public static void main(String[] args) {
	   Scanner in = new Scanner (System.in);
	   int size=25;
	   int arr []= new int [25];
	   int i,j;
	   for (i=0;i<size;i++)
	       arr[i]=in.nextInt();
	   int max = arr[0];    
	   for (i=1;i<size;i++)
	        if (arr[i]>max)
	            max=arr[i];
	    System.out.println (max + " is the greatest number in the array");
	        
	        
	    
	}
}
