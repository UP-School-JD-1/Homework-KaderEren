public class ClothProduct extends ExtendedProduct {
    private String sex;
    private String size;

    public ClothProduct(String sku, String description, String depot, String place, double price, double tax,
            String sex, String size) {
        super(sku, description, depot, place, price, tax);
        this.sex = sex;
        this.size = size;
    }

    @Override
    public void purchase() {
        System.out.println("satın alma");

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
