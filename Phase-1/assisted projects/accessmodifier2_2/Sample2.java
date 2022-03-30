package accessmodifier2_2;
import accessmodifier1_2.Sample1;
	
	public class Sample2 extends Sample1 
	{
		public static void main(String[] args)
		{
           Sample2 x=new Sample2();
           x.methodPublic();
           x.methodProtected();
		}
	}