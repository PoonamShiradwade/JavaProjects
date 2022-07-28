
public class ClassVariables 
{
	int id;
	String name;
	
	ClassVariables(int a, String b)
	{
		id=a;
	    name=b;
	}
	void getvalues(int x, String y)
	{
		 id=x;
		 name=y;	
	}
	void display()
	{
		System.out.println(id+"   "+name);
	}
	
	public static void main(String[] args) 
	{
		ClassVariables obj=new ClassVariables(2,"ABC");//Assigning variables using constructor
		//obj.id=20;
		//obj.name="Poonam"; // using class variables
		//obj.getvalues(22, "PoonamBS");//Assigning variables using methods
		obj.display();
	
	}
}
