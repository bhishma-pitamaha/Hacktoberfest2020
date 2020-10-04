
public class MethodOverloading {
	
	int num;
	
	MethodOverloading()
	{
		System.out.println("Default Constructor");
	}
	
	MethodOverloading(int x)
	{
		num = x;
		System.out.println("Parameterized Constructor 1");
	}
	
	MethodOverloading(int x, int y)
	{
		num = x;
		System.out.println("Parameterized Constructor 2");
	}
	
	int add(int x, int y)
	{
		return(x+y);
	}

	int add(int x, int y, int z)
	{
		return(x+y+z);
	}
	
	double add(double x, double y)
	{
		return(x+y);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		// you can ever take input from user during runtime
		System.out.println("Total is " + obj.add(5, 6));
		System.out.println("Total is " + obj.add(1, 2, 3));
		System.out.println("Total is " + obj.add(3.5, 2.2));
	}

}
