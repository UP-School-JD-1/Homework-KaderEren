import java.util.Date;

public abstract class Student {

    private int no;
    private String name;
    private int year;
    private Date dob;
    private String major;

    // constructor oluşturuldu.
    public Student(int no, String name, int year, Date dob, String major) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.dob = dob;
        this.major = major;

    }

    // şimdilik böyle yazdım tatlım :)))

    public abstract void study();

    public abstract void register();

    @Override
    public String toString() {
        return name + "isimli öğrenci " + year + "yılında kayıt oldu. ";
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}