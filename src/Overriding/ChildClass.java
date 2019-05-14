package Overriding;

public class ChildClass extends ParentClass
{
	//Here we are Overriding method of MethodOverriding_A Class
	//Static Methods cannot be overridden because Static Methods belongs to Class, they are not part of Objects.
	public void Show()
	{
		System.out.println("Show() Method is Overridded");
	}
	
	public static void print()
	{
		System.out.println("Static Method is been Overridden");
	}
	
	public static void main(String[] args)
	{
		ChildClass override2 = new ChildClass();
		override2.Show(); //Calling Overridden Non-Static Method
		
		//Calling Static Method by using Class Name
		ChildClass.print();
	}
}
