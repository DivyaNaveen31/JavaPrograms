package Collections;
import java.util.HashSet;
import java.util.Set;
public class setDemo
{
	public static void main(String[] args) 
	{
		//Here it will accept Only String values.
		Set<String> demo = new HashSet<String>(); //Here, it will import only Set Methods.
		demo.add("Om"); //Set is a Java interface which extends collections interface.
		demo.add("SaiBaba"); //Set is a grouping of unordered elements.
		demo.add("SaiBaba"); //Set does not allows duplicates elements.
		
		System.out.println(demo); //Prints all values in Set.
		//System.out.println(demo.get(3)); //Set does not allows to access elements using Index.
	}
}