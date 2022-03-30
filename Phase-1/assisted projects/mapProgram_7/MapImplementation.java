package mapProgram_7;
import java.util.*;


public class MapImplementation
{
		public static void main(String[] args) 
		{
			
			HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		      hm.put(1,"Divya");    
		      hm.put(2,"Pujita");    
		      hm.put(3,"Anitha");   
		       
		      System.out.println("\nThe elements of Hashmap are ");  
		      for(Map.Entry m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
		      		       
		      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		      
		      ht.put(4,"Akshaya");  
		      ht.put(5,"Preeti");  
		      ht.put(6,"Chaitanya");  
		      ht.put(7,"Bhavya");  

		      System.out.println("\nThe elements of HashTable are ");  
		      for(Map.Entry n:ht.entrySet()){    
		       System.out.println(n.getKey()+" "+n.getValue());    
		      }
		      		      
		      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(8,"Swetha");    
		      map.put(9,"Bhaskar");    
		      map.put(10,"Lakshmi");       
		      
		      System.out.println("\nThe elements of TreeMap are ");  
		      for(Map.Entry l:map.entrySet()){    
		       System.out.println(l.getKey()+" "+l.getValue());    
		      }    
		      
		   }  
	}

