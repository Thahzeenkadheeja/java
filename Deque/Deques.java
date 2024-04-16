import java.util.*;
public class Deques
{
	public static void main(String[]args)
	{
		Deque<String>deque=new ArrayDeque<String>();
		deque.add("a");
		deque.add("b");
		deque.add("c");
		deque.add("d");
		deque.add("e");
		System.out.println("Elements in dequeue:");
		for(String str:deque)
		{
			System.out.print(str + " ");
		}
		deque.addFirst("z");
		System.out.println("\n after adding element at front");
		for(String str : deque)
		{
			System.out.print(str + " ");
		}
		deque.addLast("f");
		System.out.println("\n after adding element at last");
		for(String str : deque)
		{
			System.out.print(str + " ");
		}
		deque.remove();
		System.out.println("\n after deleting element at front");
		for(String str : deque)
		{
			System.out.print(str + " ");
		}
		deque.clear();
		deque.add("x");
		System.out.println("\n after deleting all elements from queue and adding a element");
		for(String str : deque)
		{
			System.out.print(str + " ");
		}
}
}

