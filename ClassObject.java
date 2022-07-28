
public class ClassObject 
{
	int id;
	String name;
	void display()
	{
		//variables
		System.out.println(id); 
		System.out.println(name);
	}
	

	public static void main(String[] args) 
	{
		ClassObject obj=new ClassObject(); //creating class object
		obj.id=10;
		obj.name="Poonam";
		obj.display();//calling method using object
		
		

	}

}
