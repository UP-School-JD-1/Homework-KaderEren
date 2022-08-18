public class ShapeTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("üçgen1", 5, 12, 10, 8);
        Triangle triangle2 = new Triangle("üçgen2", 5, 20, 6, 8);
        System.out.println(triangle); 
        System.out.println(triangle2); 
        System.out.println(triangle.equals(triangle2) ? "Üçgenler birbirine eşit." : "Üçgenler birbirine eşit değil.");
        triangle.draw();


        Rectangle rectangle1 = new Rectangle("1.dikdörtgen", 10, 6);
        System.out.println("\n" + rectangle1);

        Square square1 = new Square("1.kare", 8);
        Square square2 = new Square("2.kare", 8);
        System.out.println("\n" + square1);
        System.out.println(square1.equals(square2) ? "kareler birbirine eşit." : "kareler birbirine eşit değil.");

        Circle circle1 = new Circle("1.Daire", 4);
        System.out.println("\n" + circle1);
        circle1.erase();




    }
}
