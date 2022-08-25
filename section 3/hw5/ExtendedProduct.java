public abstract class ExtendedProduct extends SimpleProduct implements Pricable {

    private double price;
    private double tax;

    public ExtendedProduct(String sku, String description, String depot, String place, double price, double tax) {
        super(sku, description, depot, place);
        setPrice(price);
        setTax(tax);
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

}
