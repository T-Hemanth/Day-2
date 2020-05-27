import java.io.*;
import java.util.*;
import java.lang.*;
public class Leastperfalg5
{
    public static double lcm (double a,double b)
    {
        double start;
        double flag=0;
        double i=1;
        double x=1;
        if (a<b)
            start = b;
        else
            start = a;
        while (flag==0)
        {
             x=a*i;
            if (x % b == 0)
            {
                flag=1;
            }
            i++;
        }
        return x;
    }
    public static boolean perf (double a)
    {
        double sq = Math.sqrt (a);
        return ((sq-Math.floor (sq))==0);
    }
    
	public static void main(String[] args) {
		
	double a=21;
	double b=36;
	double c=66;
	double lcma,lcmf;
    lcma = lcm (a,b);
    lcmf = lcm (lcma,c);
    double i=1;
    double flag=1;
    double temp;
    while (flag==1)
    {
        temp =lcmf * i;
        if (perf (temp))
        {
            System.out.println (temp);
            flag=0;
        }
        i++;
    }
	
	}
}