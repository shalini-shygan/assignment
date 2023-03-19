import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class Sets {
	public static void main(String args[])
	{
		HashSet <String> names = new HashSet<> ();
		TreeSet <String> fruits = new TreeSet<> ();
		ArrayList <String> animals = new ArrayList <> ();
		names.add("Saumya");
		names.add("Shalini");
		names.add("Sathish");
		names.add("Sharath");
		names.add("Rachana");
		fruits.add("Grapes");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Melon");
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Fox");
		animals.add("Dog");
		animals.add("Cat");
		Iterator<String> n= names.iterator();
		System.out.println("Names:");
		while(n.hasNext())
		{
			System.out.println(n.next());
		}
		
		Iterator<String> f= fruits.iterator();
		System.out.println("\nFruits:");
		while(f.hasNext())
		{
			System.out.println(f.next());
		}
		
		Iterator<String> a= animals.iterator();
		System.out.println("\nAnimals:");
		while(a.hasNext())
		{
			System.out.println(a.next());
		}
	}
}
