public class Rectangle extends Shape {

    private double sortEdge;
    private double longEdge;

    public Rectangle(String name, double sortEdge, double longEdge) {
        super(name);
        this.sortEdge = sortEdge;
        this.longEdge = longEdge;
    }

    @Override
    public double calculateArea() {
        double area = (longEdge * sortEdge);
        return area;
    }

    @Override
    public double calculateCircumference() {
        double circumference = 2 * (longEdge + sortEdge);

        return circumference;
    }

    public double getSortEdge() {
        return sortEdge;
    }

    public void setSortEdge(double sortEdge) {
        this.sortEdge = sortEdge;
    }

    public double getLongEdge() {
        return longEdge;
    }

    public void setLongEdge(double longEdge) {
        this.longEdge = longEdge;
    }
    @Override
    public String toString() {
    
        return super.getName() +  "'in alani : " + calculateArea() + "\n" + super.getName() +  "'in cevresi : " + calculateCircumference();
    }

    @Override
    public boolean equals(Object obj) {
        //Object tipi rectangle tipine döndü
        Rectangle rectangle = Rectangle.class.cast(obj);
        return rectangle.longEdge == longEdge && rectangle.sortEdge == sortEdge ;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
