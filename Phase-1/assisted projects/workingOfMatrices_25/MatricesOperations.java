package workingOfMatrices_25;

public class MatricesOperations {
	public static int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
	public static int b[][]={{1,3,4},{2,4,3},{1,2,4}}; 
	public static int c[][]=new int[3][3];  
	
	public static void add()
	{
		System.out.println("Addition of matrices is:");
		for(int i=0;i<3;i++)
		{    
			for(int j=0;j<3;j++)
			{   
				c[i][j]=a[i][j]+b[i][j]; 
				System.out.print(c[i][j]+" ");
			}
		}
		System.out.println();
	}
	public static void sub()
	{
		System.out.println("Subtraction of matrices is:");
		for(int i=0;i<3;i++)
		{    
			for(int j=0;j<3;j++)
			{    
				c[i][j]=a[i][j]-b[i][j];  
				System.out.print(c[i][j]+" ");
			}
		}
		System.out.println();
	}
	public static void mul()
	{
		System.out.println("Multiplication of matrices is:");
		for(int i=0;i<3;i++)
		{    
			for(int j=0;j<3;j++)
			{    
				c[i][j]=0;      
				for(int k=0;k<3;k++)      
				{      
					c[i][j]+=a[i][k]*b[k][j];      
				}  
				System.out.print(c[i][j]+" ");   
			} 
			System.out.println();
	   }
	}
	
	public static void main(String args[])
	{ 
			System.out.println("The Operations of Matrix are as follows:");
		    add();
		    sub();
		    mul();   
	}
}
