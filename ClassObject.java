
public class ClassObject 
{
	int id;
	String name;
	void display()
	{
		System.out.println(id);
		System.out.println(name);
	}
	

	public static void main(String[] args) 
	{
		ClassObject obj=new ClassObject();
		obj.id=10;
		obj.name="Poonam";
		obj.display();
		
		

	}

}
