import java.util.*;
import java.io.*;
public class Repeatedchar4
{
	public static void main(String[] args) {
	   Scanner in = new Scanner (System.in);
	   String input = new String ();
	   List<Character> op = new ArrayList<Character>();
	   input = in.nextLine ();
	   int i,j;
	   int len = input.length ();
	   for (i=0;i<len;i++)
	   {
	       char a=input.charAt(i);
	       for (j=i+1;j<len;j++)
	       {
	           char b=input.charAt(j);
	           if (a == b)
	           {
	               if (op.contains (a))
	               {
	                   continue;
	               }
	               else
	               {
	                op.add (a);
	               } 
	           }
	           else
	                if (!(op.contains (a)))
	                    op.add (a);
	       }
	   }
	   String outp= new String();
	   int leng = outp.length();
	   System.out.println (leng);
	   for (char x : op)
	   {
	       if (!(leng>0))
	       {
	            outp=Character.toString (x);
	            leng++;
	       }
	       else
	       {
	           outp=(outp.concat (Character.toString (x)));
	       }
	       
	   }
	   System.out.println (outp);
	   }
}