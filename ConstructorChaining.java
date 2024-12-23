package Program112;

class Car1 
{
    private String name;
    private int mileage;
    private int cost;
    
    // Zero-parameterized constructor
    public Car1() 
    {
        name = "BMW";
        mileage = 10;
        cost = 7000000;
    }

    // Parameterized constructor
    public Car1(String name, int mileage, int cost)
    {
        this.name = name;    
        this.mileage = mileage; 
        this.cost = cost;      
    }
    public Car1(String name) 
    {
        this();  
        this.name = name;  
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
public class ConstructorChaining {
    public static void main(String[] args) 
    {   
        Car1 c = new Car1("Ferrari", 6, 8000000);
        System.out.println(c.getName());  
        System.out.println(c.getMileage());
        System.out.println(c.getCost());  

        System.out.println("***********");

        Car1 c1 = new Car1();
        System.out.println(c1.getName()); 
        System.out.println(c1.getMileage());
        System.out.println(c1.getCost()); 
    }
}
