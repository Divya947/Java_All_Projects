package constructortypes_5;
import java.util.Scanner;  

public class Constructor {
	private String name;  
	private int age;    
	public Constructor(String name, int age)  
	{  
	this.name =name;  
	this.age = age;  
	}    
	public Constructor()  
	{  
	this.name = "Divya";  
	this.age = 22;  
	}  
	public void show()  
	{  
	System.out.println("Name of the student is: "+this.name);  
	System.out.println("Age of the student is: "+this.age);  
	}  
	public static void main(String args[])   
	{  
	Constructor c =new Constructor();   
	Scanner sc = new Scanner(System.in);  
	System.out.println("Enter the name of the student: ");  
	String name = sc.nextLine();  
	System.out.println("Enter the age of the student: ");  
	int age = sc.nextInt();  
	System.out.println(" ");   
	System.out.println("Show() method for the parameterized constructor: ");  
	new Constructor(name, age).show();    
	System.out.println("Show() method for the default constructor: ");  
	new Constructor().show();  
	}  
}  
