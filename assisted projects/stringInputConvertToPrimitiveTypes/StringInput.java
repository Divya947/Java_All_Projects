package stringInputConvertToPrimitiveTypes;
import java.util.Scanner;

public class StringInput 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		int a; long b; char c; double d; float f;
			
		a=Integer.parseInt(str);
		System.out.println("String to int>>  "+a);
			
		b=Long.parseLong(str);
		System.out.println("String to long>>  "+b);
					
		d=Double.parseDouble(str);
		System.out.println("String to double>>  "+d);
			
		f=Float.parseFloat(str);
		System.out.println("String to float>>  "+f);

	}

}