import java.util.Date;

public class MasterStudent extends AbstractStudent {

    public MasterStudent(int no, String name, int year, Date dob, String major) {
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

    public void writeThesis() {
        System.out.println(super.getName() + "isimli öğrenci tezini yazdı. ");
    }

    public void meetWithAdvisor() {
        System.out.println(super.getName() + "isimli öğrenci danışmanı ile tanıştı. ");
    }

}
