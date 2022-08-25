
public class RegistrationOffice {

    public Student getAStudent(Student s) {

        if (s instanceof PhdStudent) {
            PhdStudent t = (PhdStudent) s;
            System.out.println(
                    "Mezun Öğrenci... Bu bir doktora öğrencisi ve "
                            + (t.isQualifyingExamTaken() ? "sınavı geçti " : "sınavı geçemedi"));
            return t;
        } else if (s instanceof MasterStudent) {
            System.out.println("Mezun Öğrenci... Bu bir master öğrencisi");
        } else if (s instanceof GraduateStudent) {
            GraduateStudent t = (GraduateStudent) s;
            System.out.println("Mezun Öğrenci... Danışman Hocası" + t.getAdvisor() + " ve tezi" + t.getThesis());
            return t;
        } else if (s instanceof UndergraduateStudent) {
            UndergraduateStudent t = (UndergraduateStudent) s;
            System.out.println("Mezun Olmayan Öğrenci..." + "minoru: " + t.getMinor());
            return t;
        } else if (s instanceof VocationalStudent) {
            System.out.println("Vocational Öğrenci...");
        }
        return s;
    }

    public void registerStudent(Student s) {

        if (s instanceof PhdStudent) {
            PhdStudent t = (PhdStudent) s;
            System.out.println(
                    "Mezun Öğrenci... Kayıt ediliyor"
                            + (t.isQualifyingExamTaken() ? "sınavı geçti " : "sınavı geçemedi"));
        } else if (s instanceof MasterStudent) {
            System.out.println("Mezun Öğrenci... Bu bir master öğrencisi kayıt ediliyor");
        } else if (s instanceof GraduateStudent) {
            GraduateStudent t = (GraduateStudent) s;
            System.out.println("Mezun Öğrenci... Danışman Hocası" + t.getAdvisor() + " ve tezi" + t.getThesis()
                    + "kayıt ediliyor.");
        } else if (s instanceof UndergraduateStudent) {
            UndergraduateStudent t = (UndergraduateStudent) s;
            System.out.println("Mezun Olmayan Öğrenci..." + "minoru: " + t.getMinor() + " kayıt ediliyor");
        } else if (s instanceof VocationalStudent) {
            System.out.println("Vocational Öğrenci... kayıt ediliyor.");
        }
    }

}
