public class Square extends Shape {

    private double edge;

    public Square(String name, double edge) {
        super(name);
        this.edge = edge;
    }

    @Override
    public double calculateArea() {
        double area = (edge * edge);
        return area;
    }

    @Override
    public double calculateCircumference() {
        double circumference = (4 * edge);
        return circumference;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        return super.getName() + "'nin alani : " + calculateArea() + "\n" + super.getName() +  "'nin cevresi : " + calculateCircumference();
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        //Object tipi Square tipine döndü
        Square square = Square.class.cast(obj);
        return square.edge == edge ;
    }

}
