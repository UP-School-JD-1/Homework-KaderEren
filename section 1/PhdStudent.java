import java.util.Date;

public class PhdStudent extends GraduateStudent {
    private boolean qualifyingExamTaken; 
    public PhdStudent(int no, String name, int year, Date dob, String major,String advidor,String thesis, boolean qualifyingExamTaken) {
        super(no, name, year, dob, major,advidor,thesis);
        this.qualifyingExamTaken = qualifyingExamTaken;
    }


    public void study(){
        System.out.println("Study metodu çalışıyor.");
        double study;
    }
    public void register(){
        System.out.println(super.getName() + "isimli öğrenci kayıt oldu");
    }
    
    public void writeThesis (){
        System.out.println(super.getName() + "isimli öğrenci tezini yazdı. ");
    }

    public void meetWithAdvisor (){
        System.out.println(super.getName() + "isimli öğrenci danışmanı ile tanıştı. ");
    }
    
    public void writePaper(){
        System.out.println(super.getName() + "isimli öğrenci kağıt kullandı ");
    }


    public boolean isQualifyingExamTaken() {
        return qualifyingExamTaken;
    }


    public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
        this.qualifyingExamTaken = qualifyingExamTaken;
    }

    
}
