import java.util.Date;

public class GraduateStudent extends Student {

    private String advisor;
    private String thesis;

    public GraduateStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major);
        this.advisor = advisor;
        this.thesis = thesis;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
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
        System.out.println(super.getName() + "isimli öğrenci danışmanı ile tanıştı.");
    }

}
