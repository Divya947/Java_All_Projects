package create_calc_3;
import java.util.Scanner;

public class BasicCalc 
{
	
		public static void main(String[] args)
		{
				Scanner sc= new Scanner(System.in);
				int choice;
				int  a,b,result;
					System.out.println("Enter your choice");
					System.out.println("1.Addition");
					System.out.println("2.Subtraction");
					System.out.println("3.Multiplication");
					System.out.println("4.Division");
					System.out.println("5. exit");
					choice=sc.nextInt();
				    switch(choice)
				    {
				       case 1: System.out.println("Enter any two numbers for performing addition");
				               a =sc.nextInt();
			                   b =sc.nextInt();
                               result=a+b;
				               System.out.println("Addition of "+a+" and "+b+" is: "+result);
			                   break;
				        case 2: System.out.println("Enter any two numbers for performing subtraction");
				                a =sc.nextInt();
			                    b =sc.nextInt();
				                result=a-b;
			                    System.out.println("Subtraction of "+a+" and "+b+" is: "+result);
			                    break;        
				        case 3: System.out.println("Enter any two numbers for performing multiplication");
				                a =sc.nextInt();
			                    b =sc.nextInt();
				                result=a*b;
			                    System.out.println("Multiplication of "+a+" and "+b+" is: "+result);
			                    break;
				        case 4: System.out.println("Enter any two numbers for performing Division");
				                a =sc.nextInt();
			                    b =sc.nextInt();
				                result=a/b;
			                    System.out.println("Division of "+a+" and "+b+" is: "+result);
			                    break;
			            case 5: System.out.println(" exit"); 
			                    break;
			            default: System.out.println("you have entered wrong choice");
			                     break;
				    }
		}
}

				
					
			