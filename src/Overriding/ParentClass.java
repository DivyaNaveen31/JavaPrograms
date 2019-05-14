package Overriding;

public class ParentClass
{
	public void Show()
	{
		System.out.println("I Ain't Overrided as of now");
	}
	
	public static void print()
	{
		System.out.println("Checking if we can Override Static Method");
	}
	
	public static void main(String[] args)
	{
		ParentClass override1 = new ParentClass();
		override1.Show(); //Calling Non-Static Method by Creating an Object
		ParentClass.print();
		//Calling actual method implementation >> Here Methods is not Overridden yet
	}
}
