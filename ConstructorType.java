
public class ConstructorType
{
	int id;
	String name;
	
	ConstructorType()
	{
		id=10;
		name="Poonam";
	}
	ConstructorType(int a, String b)
	{
		id=a;
		name=b;
	}
	
	void display()
	{
		System.out.println(id+"     "+name);
	}

	public static void main(String[] args) {
		
    //ConstructorType con=new ConstructorType();invoking Default constructor
   ConstructorType con=new ConstructorType(20,"Poonam");//invoking parameterized constructor
    con.display();


	}

}
