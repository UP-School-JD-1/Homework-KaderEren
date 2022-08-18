public class Circle extends Shape{
    private double radius;
    private final static double pi = 3.14;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        double area = (pi*radius*radius); 
        return area;
    }


    @Override
    public double calculateCircumference() {
        double circumference = (2*pi*radius);
        return circumference;
    }
    @Override
    public String toString() {
        return super.getName() + "'nin alanı : " + calculateArea() + "\n" +  super.getName() + "'nin cevresi : " + calculateCircumference();
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
   public boolean equals(Object obj) {
        //Object tipi Circle tipine döndü
        Circle circle = Circle.class.cast(obj);
        return circle.radius == radius;
    }

}
