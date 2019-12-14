abstract class Shape
{
    private boolean filled;
    private String color;
    Shape()
    {
        color = "green";
        filled = true;
    }
    Shape(boolean filled, String color)
    {
        this.filled = filled;
        this.color = color;
    }
    void setFilled(boolean value)
    {
        filled = value;
    }
    boolean isFilled()
    {
        return filled;
    }
    void setColor(String color)
    {
        this.color = color;
    }
    String getColor()
    {
        return color;
    }
    abstract double getArea();
    @Override
    public String toString() {
        if(filled)
            return "A shape with color of "+color+" and filled";
        else
            return "A shape with color of "+color+" and not filled";
    }
}
class Circle extends Shape
{
    private double radius;
    Circle(double radius)
    {
        this.radius = radius;
    }
    Circle(boolean filled, String color, double radius)
    {
        super(filled,color);
        this.radius = radius;
    }
    @Override
    double getArea() {
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape
{
    private double length,breadth;
    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    Rectangle(boolean filled, String color, double length, double breadth)
    {
        super(filled,color);
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double getArea() {
        return length*breadth;
    }
}
class Square extends Rectangle
{
    Square(double side)
    {
        super(side, side);
    }
    Square(boolean filled, String color, double side)
    {
        super(filled, color, side, side);
    }
}
class A2
{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(false, "red", 20, 40);
        Circle c = new Circle(true, "blue", 5);
        Square s = new Square(false, "black", 40);
        System.out.println(r.toString());
        System.out.println("Area of rectangle:"+r.getArea());
        System.out.println("Area of square:"+s.getArea());
        System.out.println("Area of circle:"+c.getArea());
        // Shape s = new Shape() error
    }
}