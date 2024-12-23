package Program112;
class Car
{
	String name;
	int mileage;
	int cost;
	//setter method
	public void setData(String name,int mileage,int cost)
	{
		this.name=name;
		this.mileage=mileage;
		this.cost=cost;
	}
	public String getName()
	{
		return name;
	}
	public int getMileage()
	{
		return mileage;
	}
	
	public int getCost()
	{
		return cost;
	}
}
public class Encapsulation 
{
	public static void main(String[] args)
	{	
		Car c = new Car();
		c.setData("BMW", 10, 7000000);
		System.out.println(c.getName());
		System.out.println("---------");
		System.out.println(c.getMileage());
		System.out.println("---------");
		System.out.println(c.getCost());
	}
}
