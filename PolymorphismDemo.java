package Program122;

class Plane
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
class CargoPlane extends Plane //Child class
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
class PassengerPlane extends Plane //Child class
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
class FighterPlane extends Plane //Child class
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
public class PolymorphismDemo 
{
	public static void main(String[] args) 
	{
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.carryCargo();
		
		System.out.println("==================");
		
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.carrypassenger();
		
		System.out.println("==================");
		
		fp.takeoff();
		fp.fly();
		fp.land();
		fp.carryweapones();
	}
}
