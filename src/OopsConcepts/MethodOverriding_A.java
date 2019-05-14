package OopsConcepts;

public class MethodOverriding_A
{
	public void Show()
	{
		System.out.println("I Ain't Overridden as of now");
	}
	
	public static void main(String[] args)
	{
		MethodOverriding_A override1 = new MethodOverriding_A();
		override1.Show(); //Calling Non-Static Method by Creating an Object
		//Calling actual method implementation >> Here Method is not Overridden yet
	}
}
