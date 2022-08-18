import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistrationOfficeTest {
    public static void main(String[] args) {
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        Date date;
        try {
            date = dateformat.parse("17/07/1989");
            GraduateStudent s = new GraduateStudent(234234, "name", 3432,date, "asdsa","Kader Eren","Yapay Zeka...");
            PhdStudent p = new PhdStudent(234234, "name", 3432,date, "asdsa","Kader Eren","Bu ne güzellik", false);
            RegistrationOffice rg = new RegistrationOffice();
            rg.getAStudent(s);
            rg.getAStudent(p);
        } catch (ParseException e) {
            e.printStackTrace();
        }
       
    }
}
