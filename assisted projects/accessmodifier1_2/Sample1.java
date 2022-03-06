package accessmodifier1_2;

public class Sample1 
{
	private int S= 300;   //private variable
	
	long L = 2600;       // default variable
	
	public void methodPublic()
	{     // public method
		System.out.println("   !!!This is public method of Sample1 class!!!");
	}
	
	protected void methodProtected()
	{   // protected method
		System.out.println("   !!!This is protected method of Sample1 class!!!");
         methodPrivate();
	}
	
	void methodDefault()
	{           //default method
		System.out.println("   !!!This is default method of Sample1 class!!!");
	}
	private void methodPrivate()
	{     // private method
		System.out.println("Class Sample1: methodProtected");
		System.out.println("Value of private value S"+ S);
		System.out.println("Value of long"+ L);
       }
	public static void main(String[] args)
	{
		Sample1 q=new Sample1();
     q.methodDefault();
	}

}
