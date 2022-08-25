public class Advisor extends ExtendedProduct{

    private String name;
    private int experience;
    public Advisor(String sku, String description, String depot, String place, double price, double tax,String name,int experience) {
        super(sku, description, depot, place, price, tax);
        setName(name);
        setExperience(experience);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    @Override
    public void purchase() {
        // TODO Auto-generated method stub
        
    }
}
