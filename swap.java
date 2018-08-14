import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int x,y,temp;
	Scanner s=new Scanner(System.in);
	System.out.println("enter x and y");
	x=s.nextInt();
	y=s.nextInt();
	System.out.println("before swaping \nx="+x+" \ny="+y);
	temp=x;
	x=y;
	y=temp;
	System.out.println("after swapping \nx="+x+"\ny="+y);
	}
}
