package Program122;

class Plane1
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
class CargoPlane1 extends Plane //Child class
{
	void fly() //Override method)
	{
		System.out.println("cargo Plane is flying at low height");
	}
	void carryCargo() //specialized method
	{
		System.out.println("Cargo Plane caries cargo");
	}	
}
class PassengerPlane1 extends Plane //Child class
{
	void fly() //Override method)
	{
		System.out.println("Passenger Plane is flying at medium height");
	}
	void carrypassenger() //specialized method
	{
		System.out.println("Passenger Plane carries passenger");
	}			
}
class FighterPlane1 extends Plane //Child class
{
	void fly() //Override method)
	{
		System.out.println("fighter Plane is flying at medium height");
	}
	void carryweapones() //specialized method
	{
		System.out.println("fighter Plane caries weapones");
	}		
}
public class PolymorphismDemo2
{
	public static void main(String[] args) 
	{
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		
		Plane ref; //Parent type reference
		
		ref=cp; //Assigned child type reference to parent type
		ref.takeoff();  //one reference and one behavior
		ref.fly();
		ref.land();
		((CargoPlane)(ref)).carryCargo();  //Downcasting
		
		System.out.println();
		System.out.println("-------------------");
		
		ref=pp;
		ref.takeoff();
		ref.fly();
		ref.land();
		((PassengerPlane)(ref)).carrypassenger();
		
		System.out.println();
		System.out.println("-------------------");
		
		ref=fp;
		ref.takeoff();
		ref.fly();
		ref.land();
		((FighterPlane)(ref)).carryweapones();
	}
}
