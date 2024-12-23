package Program122;

class Plane2
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
class CargoPlane2 extends Plane //Child class
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
class PassengerPlane2 extends Plane //Child class
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
class FighterPlane2 extends Plane //Child class
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
class Demo
{
	void permit(Plane ref)
	{
		ref.takeoff();
		ref.fly();
		ref.land();
	}
}
public class PolymorphismDemo3
{
	public static void main(String[] args) 
	{
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		
		Demo d=new Demo();
		d.permit(cp);//code flexibility is achieved by making use of one function
		d.permit(pp);// call the child type reference
		d.permit(fp);
	}
}
