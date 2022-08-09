
public class Overloading
{
	int a,b;
	String name;
	double c;
	
	void display(int x, int y)
	{
		a=x;
		b=y;
		System.out.println(x+" "+y) ;
	}
	void display(String p, double q )
	{
		name=p;
		c=q;
		System.out.println(p+"  "+q);
	}
	public static void main(String[] args) 
	{
		Overloading ov=new Overloading();
		ov.display(1,2);
		ov.display("Poonam", 22.2);
		
		
	}
	
		
	}


