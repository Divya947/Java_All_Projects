package collectionAndTypes_6;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Collections {
	
	   public static void main(String[] args) {
	      List lnkLst = new LinkedList();
	      lnkLst.add("sunday");
	      lnkLst.add("monday");
	      lnkLst.add("friday");
	      lnkLst.add("saturdsy");
	      displayAll(lnkLst);
	      
	      List aryLst = new ArrayList();
	      aryLst.add("January");
	      aryLst.add("June");
	      aryLst.add("August");
	      aryLst.add("July");
	      displayAll(aryLst);
	      
	      Set hashSet = new HashSet();
	      hashSet.add("Apple");
	      hashSet.add("Mango");
	      hashSet.add("Kiwi");
	      hashSet.add("Grapes");
	      displayAll(hashSet);
	      
	      SortedSet treeSet = new TreeSet();
	      treeSet.add("1");
	      treeSet.add("4");
	      treeSet.add("3");
	      treeSet.add("0");
	      displayAll(treeSet);
	      
	      LinkedHashSet lnkHashset = new LinkedHashSet();
	      lnkHashset.add("one");
	      lnkHashset.add("two");
	      lnkHashset.add("three");
	      lnkHashset.add("four");
	      displayAll(lnkHashset);
	      
	      Map map1 = new HashMap();
	      map1.put("1", "one");
	      map1.put("2", "Two");
	      map1.put("3", "three");
	      map1.put("4", "four");
	      displayAll(map1.keySet());
	      displayAll(map1.values());
	      
	      SortedMap map2 = new TreeMap();
	      map2.put("student1", "100");
	      map2.put("student2", "90");
	      map2.put("student3", "45");
	      map2.put("student4", "75");
	      displayAll(map2.keySet());
	      displayAll(map2.values());
	      
	      LinkedHashMap map3 = new LinkedHashMap();
	      map3.put("1", "Red");
	      map3.put("2", "Black");
	      map3.put("3", "Yellow");
	      map3.put("4", "Green");
	      displayAll(map3.keySet());
	      displayAll(map3.values());
	   }
	   static void displayAll(Collection col) {
	      Iterator itr = col.iterator();
	      while (itr.hasNext()) {
	         String str = (String) itr.next();
	         System.out.print(str + " ");
	      }
	      System.out.println();
	   }
	}
