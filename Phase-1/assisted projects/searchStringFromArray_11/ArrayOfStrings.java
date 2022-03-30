package searchStringFromArray_11;
import java.util.*;

public class ArrayOfStrings {
	 public static void main(String[] args) { 
		 Scanner sc =new Scanner(System.in);
		 System.out.println("enter the strings");
         String[] str = { "divya" , "pujita", "ammu", "pinky"}; 
         boolean x = false; 
         int index = 0;   
         String s = sc.next();  
         for (int i = 0; i < str.length; i++) {  
             if(s.equals(str[i])) {  
                 index = i; x = true; break;  
             }  
         }  
         if(x)  
             System.out.println(s +" String is found at index "+index);  
         else  
             System.out.println(s +" String is not found in the array");  
     }  
}  

