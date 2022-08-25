public class Gift extends SimpleProduct{

    public Gift(String sku, String description, String depot, String place) {
        super(sku, description, depot, place);
    }

    @Override
    public String getDepot() {
        return super.getDepot();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public String getPlace() {
        return super.getPlace();
    }

    @Override
    public String getSku() {
        return super.getSku();
    }

    @Override
    public void setDepot(String depot) {
        super.setDepot(depot);
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public void setPlace(String place) {
        super.setPlace(place);
    }

}