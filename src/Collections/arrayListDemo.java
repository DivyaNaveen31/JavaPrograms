package Collections;
import java.util.ArrayList;
public class arrayListDemo
{
	public static void main(String[] args) 
	{
		//Here it will accept int, Character and String values as well.
		//Below is Non-Generics
		ArrayList demo = new ArrayList(); //Here it will import List and ArrayList Values.
		demo.add(1);
		demo.add("Om"); //List is a Java interface which extends collections interface.
		demo.add("SaiBaba"); //List is a grouping of ordered elements.
		demo.add("SaiBaba"); //List allows duplicates elements.
		
		System.out.println(demo); //Prints all values in List
		System.out.println("Printing 3rd Value of ArrayList :" +demo.get(3));
		//List allows to access elements using Index.
		
		//It will now accept only String values.
		ArrayList<String> demo1 = new ArrayList<String>(); 
		demo1.add("Jai");
		demo1.add("Sai");
		
		System.out.println(demo1);
		System.out.println(demo1.get(0));		
	}
}