package OopsConcepts;

public class MethodOverriding_B extends MethodOverriding_A
{
	//Here we are Overriding method of MethodOverriding_A Class
	//Static Methods cannot be overridden because Static Methods belongs to Class, they are not part of Objects.
	public void Show()
	{
		System.out.println("I'm now Overridden");
	}
	
	public static void main(String[] args)
	{
		MethodOverriding_B override2 = new MethodOverriding_B();
		override2.Show(); //Calling Overridden Non-Static Method
	}
}
