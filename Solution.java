package Program412;

abstract class Plane 
{
    abstract void takeoff();
    abstract void fly();
    abstract void land();
}

class CargoPlane extends Plane
{
    void takeoff() 
    {
        System.out.println("Cargo plane is taking off");
    }

    void fly()
    {
        System.out.println("Cargo plane flies at low height");
    }

    void land() 
    {
        System.out.println("Cargo plane is landing");
    }
}

class PassengerPlane extends Plane 
{
    void takeoff() 
    {
        System.out.println("Passenger plane is taking off");
    }

    void fly()
    {
        System.out.println("Passenger plane flies at medium height");
    }

    void land() 
    {
        System.out.println("Passenger plane is landing");
    }
}

class FighterPlane extends Plane 
{
    void takeoff() 
    {
        System.out.println("Fighter plane is taking off");
    }

    void fly() 
    {
        System.out.println("Fighter plane flies at high height");
    }

    void land()
    {
        System.out.println("Fighter plane is landing");
    }
}

public class Solution 
{
    void permit(Plane ref)
    {
        ref.takeoff();
        ref.fly();
        ref.land();
    }
    public static void main(String[] args) 
    {
        CargoPlane c = new CargoPlane(); 
        PassengerPlane p = new PassengerPlane();
        FighterPlane f = new FighterPlane();

        Solution s = new Solution();
        
        s.permit(c);
        System.out.println("-----------------------");
        s.permit(p);
        System.out.println("------------------------");
        s.permit(f);
    }
}