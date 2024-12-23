package Program512;

class Rectangle 
{
    int length;
    int width;


    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }  
    public int calculateArea() 
    {
        return length * width;
    }
    public static void main(String[] args) 
    {
        Rectangle rectangle1 = new Rectangle(1, 5);
        Rectangle rectangle2 = new Rectangle(7, 6);  
        int area1 = rectangle1.calculateArea();
        int area2 = rectangle2.calculateArea();

        if (area1 > area2)
        {
            System.out.println("Rectangle1 > Rectangle2");
        } else if (area1 < area2)
        {
            System.out.println("Rectangle1 < Rectangle2");
        }
        else 
        {
            System.out.println("They are equal");
        }
    }
}