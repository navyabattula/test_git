package calculator;
import java.util.*;
/* the classes Addition and Subtraction has almost similar functionality but make use of different approaches in giving the answer.
 * here the sub-class makes use of super class properties but doesn't change its properties after inheriting the features. this satisfies the solid principle.
 * for example Addition class performs both addition and subtraction based on user input.
 * s.add(2,3,'+');
 * >prints answer 5
 * Similarly for example Subtraction performs both subtraction and addition based on the sign of the integer, which is completely a different functionality.
 * s.add(2,-3)
 * >prints answer 5
 */
class Addition
{
	public int add(int x, int y,char z)
	{
		int c;
		if(z=='+')
		{
			c=x+y;
			return c;
		}
		else if(z=='-')
		{
			c=x-y;
			return c;
		}
		else
		{
			return 0;
		}
	}
	
}
class Subtraction extends Addition
{
	public void add(int x,int y)
	{
		int c;
		c=x-y;
		System.out.println("The result is:"+c);
	}
}
/* the similar approach has been implemented in Multiplication and Division class
 *in Multiply class multiplication and division can be performed. 
 *in multiplication whole numbers are multiplied  and in division, fractional numbers are multiplied.
 *where as in Divison class, Two alternatives are performed , the normal division operator and modulus operator.
 *the KISS and DRY principles are applied to keep the code simple, understandable, and no repetitions. 
 */
class Multiply
{
	public void mul(int x,int y)
	{
		int c;
		c=x*y;
		System.out.println("The result is:"+c);
	}
}
class Divison extends Multiply
{
	public int mul(int x,int y,char z)
	{
		if(z=='/')
		{
		    return x/y;
		}
		else if (z=='%')
		{
		    return x%y;
		}
		else 
		{
			return 0;
		}
	}
}

public class type1 {
	public static void main(String args[])
	{
		int n,m;
		char x;
		Scanner sc=new Scanner(System.in);
		//reading the operand values
	    System.out.println("enter the operand1:");
	    n=sc.nextInt();
	    System.out.println("enter the operand2:");
	    m=sc.nextInt();
	    //reading operator
	    System.out.println("enter the operator:");
	    x=sc.next().charAt(0);
	    // creating sub -class objects
	    Subtraction s=new Subtraction();
	    Divison d=new Divison();
	    //calling methods of various classes
	    s.add(n ,m ,x );
	    s.add(n, m);
	    d.mul(n, m,x);
	    d.mul(n, m);
	    
	}

}
