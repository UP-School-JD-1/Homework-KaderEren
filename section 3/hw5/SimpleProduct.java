public abstract class SimpleProduct implements Locatable {
    private String sku;
    private String description;
    private String depot;
    private String place;

    public SimpleProduct(String sku, String description, String depot, String place) {
        this.sku = sku;
        this.description = description;
        this.depot = depot;
        this.place = place;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
}
