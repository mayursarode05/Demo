package mayur;

public class Abc {
 
	int a=120,b=180;
	
	void add()
	{
		System.out.println("A="+a);
		System.out.println("B="+b);
	}
	void subtract()
	{
		int a=60,b=40;
		 System.out.println("A="+a);
		 System.out.println("A="+ this.a);
		 System.out.println("B="+b);
		 System.out.println("B="+this.b);
		 
	}
	
	
	public static void main(String[] args)
	{
     Abc a=new Abc();
     a.add();
     a.subtract();
	}

}
