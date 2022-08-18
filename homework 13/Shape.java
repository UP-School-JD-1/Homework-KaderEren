public abstract class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public Shape(String name) {
        this.name = name;
    }

    // çizim methodu
    public void draw() {
        System.out.println(name + " isimli shape nesnesi çiziliyor...");
    };

    public void erase() {

        System.out.println(name + " isimli shape nesnesi siliniyor...");
    };

    public abstract double calculateArea();

    public abstract double calculateCircumference();

}
