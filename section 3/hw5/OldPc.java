public class OldPc implements Pricable, Locatable {

    private double price;
    private String depot;
    private String place;
    private double tax;
    private String model;

    public OldPc(double price, String depot, String place, double tax, String model) {
        this.price = price;
        this.depot = depot;
        this.place = place;
        this.tax = tax;
        this.model = model;
    }

    @Override
    public void purchase() {
        System.out.println("SATIN ALMA İŞLEMİ GERÇEKLEŞTİ");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDepot() {
        return depot;
    }

    public void setDepot(String depot) {
        this.depot = depot;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
