public class Triangle extends Shape {
    // h: yükseklik

    private double h;
    private double baseLength;
    private double edge1;
    private double edge2;

    public Triangle(String name, double h, double baseLength, double edge1, double edge2) {
        super(name);
        this.h = h;
        this.baseLength = baseLength;
        this.edge1 = edge1;
        this.edge2 = edge2;
    }

    @Override
    public double calculateArea() {
        double area = ((baseLength * h) / 2);
        return area;
    }

    @Override
    public double calculateCircumference() {
        double circumference = (baseLength+edge1+edge2);
        return circumference;
    }
    @Override
    public String toString() {

        return "\n"+super.getName()  +"  \n"+"alani: " + calculateArea() + "\n" + "çevresi: " + calculateCircumference();
    }
    @Override
    public boolean equals(Object obj) {
        //Object tipi Triange tipine döndü
        Triangle triangle = Triangle.class.cast(obj);
        return triangle.edge1 == edge1 && triangle.edge2 == edge2 && triangle.baseLength ==baseLength ;
    }

    @Override
    public int hashCode() {
        return this.hashCode();
    }

    public double getEdge1() {
        return edge1;
    }

    public void setEdge1(double edge1) {
        this.edge1 = edge1;
    }

    public double getEdge2() {
        return edge2;
    }

    public void setEdge2(double edge2) {
        this.edge2 = edge2;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }
}
