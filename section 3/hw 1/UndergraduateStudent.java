import java.util.Date;

public class UndergraduateStudent extends AbstractStudent {
    private String minor;

    public UndergraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
        super(no, name, year, dob, major);
        this.minor = minor;
    }

    public String getMinor() {
        return minor;
    }

    @Override
    public void study() {
        System.out.println("Study metodu çalışıyor.");
        double study;
    }

    @Override
    public void register() {
        System.out.println(super.getName() + "isimli öğrenci kayıt oldu");
    }

    @Override
    public String toString() {
        return super.getName() + "isimli öğrenci " + super.getYear() + "yılında kayıt oldu. ";
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

}
