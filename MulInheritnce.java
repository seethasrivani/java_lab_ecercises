package inheritance;
class Furniture1
{
	public void types()
	{
		System.out.println("All available");
	}
}
class Chair1 extends Furniture1
{
	public void legs()
	{
		System.out.println("4 legs");
	}
}
class PlasticChair extends Chair1
{
	public void weight()
	{
		System.out.println("light weight");
	}
}
public class MulInheritnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlasticChair pc=new PlasticChair();
		pc.types();
		pc.legs();
		pc.weight();
	}

}
