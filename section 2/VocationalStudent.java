import java.util.Date;

public class VocationalStudent extends Student {

    public VocationalStudent(int no, String name, int year, Date dob, String major) {
        super(no, name, year, dob, major);
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

}
