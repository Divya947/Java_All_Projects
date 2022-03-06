package queueOperations_30;
import java.util.*;

public class QueueProgram 
{
	public static void main(String[] args) 
	{
		Queue<String> locationsQueue = new LinkedList<>();
		locationsQueue.add("Mango");
	    locationsQueue.add("Apple");
	    locationsQueue.add("Grapes");
	    locationsQueue.add("Kiwi");
	    locationsQueue.add("Orange");
	    locationsQueue.add("Jackfruit");
	    locationsQueue.add("Dragonfruit");

	    System.out.println("Queue is : " + locationsQueue);
	    System.out.println("Head of Queue : " + locationsQueue.peek());
	    locationsQueue.remove();
	    System.out.println("After removing Head of Queue : " + locationsQueue);
	    System.out.println("Size of Queue : " + locationsQueue.size());
	}
}