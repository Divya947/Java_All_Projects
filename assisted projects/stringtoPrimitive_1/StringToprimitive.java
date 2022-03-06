package stringtoPrimitive_1;

public class StringToprimitive {
	public static void main(String[] args) 
	{
		String s="4784";
		Integer j=Integer.valueOf(s);
		System.out.println(j);
		int k=Integer.parseInt(s);
		System.out.println(k);
		String s1="5645.774543D";
		Double d2=Double.parseDouble(s1);
		System.out.println(d2);
		String s3="4.6f";
		Float f1=Float.parseFloat(s3);
		System.out.println(f1);
	}

}
