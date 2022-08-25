import java.util.Date;

public class FoodProduct extends ExtendedProduct {

    private Date productionDate;
    private int life;

    public FoodProduct(String sku, String description, String depot, String place, double price, double tax,
            Date productionDate, int life) {
        super(sku, description, depot, place, price, tax);
        this.productionDate = productionDate;
        this.life = life;
    }

    public Date getProductionDate() {
        return productionDate;
    }
    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }
    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        this.life = life;
    }

    @Override
    public void purchase() {
        System.out.println("PURCHASE");
    }

    
}
