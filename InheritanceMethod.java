package Program112;

class Plane      //Parent class
{
	void takeoff()
	{
		System.out.println("Plane is taking off");
	}
	void fly()
	{
		System.out.println("Plane is flying");
	}
	void land()
	{
		System.out.println("Plane is landing");
	}
}
class CargoPlane extends Plane //child class
{
	void fly()//overridden method
	{
		System.out.println("Plane is flying at low heights");
	}
	void carryCargo()//Specialized method
	{
		System.out.println("Plane is carrying cargo");
	}
}
public class InheritanceMethod
{
	public static void main(String[] args)
	{
		CargoPlane cp = new CargoPlane();
		cp.takeoff();
		System.out.println();
		cp.fly();
		System.out.println();
		cp.land();
		System.out.println();
		cp.carryCargo();
		System.out.println("-------------");
	}
}
