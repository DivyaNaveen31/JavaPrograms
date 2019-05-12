package OopsConcepts;

public class AbstractDerivedClass  extends AbstractBaseClass
{
	void fun() 
	{
		System.out.println("Implementing Incomplete fun() Abstract Method from AbstractClass");
	}

	void enjoy() 
	{
		System.out.println("Implementing Incomplete enjoy() Abstract Method from AbstractClass");
	}
	
	public static void main(String args[])
	{
		AbstractBaseClass baseClass = new AbstractDerivedClass();
		baseClass.fun();
		baseClass.enjoy(); //Here Were Creating Reference of AbstractBaseClass not an Object
		//We cannot create an object of Abstract Class
		
		AbstractDerivedClass derivedClass = new AbstractDerivedClass();
		derivedClass.fun();
		derivedClass.enjoy();
	}
}