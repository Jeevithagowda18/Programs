package Program112;

public class Constructoroverloading
{
	private String name;
	private int mileage;
	private int cost;
	
	public Constructoroverloading(String name,int mileage,int cost)
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
    public static void main(String[] args) 
    {
    	Constructoroverloading c = new Constructoroverloading("Rolls Royce",8,1000000);
    	System.out.println(c.getName());
    	System.out.println(c.getMileage());
    	System.out.println(c.getCost());
	}
}
