abstract class Vehicle
{
    Vehicle()
    {
        hashelmet = false;
    }
    Vehicle(boolean hashelmet,int yearOfManufacture)
    {
        this.hashelmet = hashelmet;
        this.yearOfManufacture = yearOfManufacture;
    }
    boolean hashelmet;
    int yearOfManufacture;
    abstract public void getData();
    abstract public void putData(boolean hashelmet,int yearOfManufacture);
}
class TwoWheeler extends Vehicle
{
    private String brand;
    protected double cost;
    String engineType;
    public String color;
    TwoWheeler(String brand,double cost,String engineType, String color)
    {
        this.brand = brand;
        this.color = color;
        this.engineType = engineType;
        this.cost = cost;
    }
    TwoWheeler(boolean hashelmet,int yearOfManufacture,String brand,double cost,String engineType, String color)
    {
        super(hashelmet, yearOfManufacture);
        this.brand = brand;
        this.color = color;
        this.engineType = engineType;
        this.cost = cost;
    }
    @Override
    public void getData() {
        System.out.println("Vehicle has helmet:"+hashelmet);
        System.out.println("Vehicle year of manu:"+yearOfManufacture);
        System.out.println("Vehicle brand:"+brand);
        System.out.println("Vehicle cost:Rs."+cost);
        System.out.println("Vehicle Color:"+color);
        System.out.println("Vehicle Engine Type:"+engineType);
    }
    @Override
    public void putData(boolean hashelmet, int yearOfManufacture) {
        this.hashelmet = hashelmet;
        this.yearOfManufacture = yearOfManufacture;
    }
}
class MyTwoWheeler extends TwoWheeler
{
    private String ownerName;
    MyTwoWheeler(boolean hashelmet,int yearOfManufacture,String brand,double cost,String engineType, String color,String ownerName)
    {
        super(hashelmet, yearOfManufacture, brand, cost, engineType, color);
        this.ownerName = ownerName;
    }
}
final class FourWheeler extends Vehicle
{
    private String brand;
    protected double cost;
    FourWheeler(String brand,double cost)
    {
        this.brand = brand;
        this.cost = cost;
    }
    FourWheeler(boolean hashelmet,int yearOfManufacture,String brand,double cost)
    {
        super(hashelmet, yearOfManufacture);
        this.brand = brand;
        this.cost = cost;
    }
    @Override
    public void getData() {
        System.out.println("Vehicle has helmet:"+hashelmet);
        System.out.println("Vehicle year of manu:"+yearOfManufacture);
        System.out.println("Vehicle brand:"+brand);
        System.out.println("Vehicle cost:Rs."+cost);
    }
    @Override
    public void putData(boolean hashelmet, int yearOfManufacture) {
        this.hashelmet = hashelmet;
        this.yearOfManufacture = yearOfManufacture;
    }
}
/*
Extending final class error
class test extends FourWheeler
{
    int test;
}
*/
class A1
{
    public static void main(String[] args) {
        MyTwoWheeler m = new MyTwoWheeler(true, 2000, "Hero", 100000, "2 Stroke", "Black", "XYZ");
        m.getData();
        m.putData(false,2001);
        m.getData();
        /* 
        Vehicle Error
            Vehicle vehicle = new Vehicle();
        */
    }
}