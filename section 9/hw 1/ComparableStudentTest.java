import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ComparableStudentTest {
    public static void main(String[] args) {
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        Date date;
        try {
            date = dateformat.parse("17/07/1989");
            GraduateStudent student1 = new GraduateStudent(12, "Kader", 2018, date, "major", "advisor", "sis");
            MasterStudent student2 = new MasterStudent(45, "ali", 2012, date, "major");
            GraduateStudent student3 = new GraduateStudent(3, "mehmet", 3432, date, "asdsa", " Kader Eren",
                    " Yapay Zeka...");
            PhdStudent student4 = new PhdStudent(24, "kezban", 3432, date, "asdsa", " Kader Eren", " Bu ne güzellik",
                    false);
            System.out.println("COMPARABLE ILE SIRALAMA");
            System.out.println("Compare student1 to student2 : " + student1.compareTo(student2));

            //adding to the list
            List<AbstractStudent> studentList = new ArrayList<AbstractStudent>();
            studentList.add(student1);
            studentList.add(student2);
            studentList.add(student3);
            studentList.add(student4);
            //sorting with comparable
            System.out.println("COMPARABLE SORTING\n");
            Collections.sort(studentList);
            for (AbstractStudent st : studentList) {
                System.out.println(st);
            }
            //sorting with comparator
            Comparator<AbstractStudent> comparator = new StudentComparator();
            //shuffle the list
            Collections.shuffle(studentList);
            System.out.println("\n" + "SHUFFLING" + "\n");
            for (AbstractStudent st : studentList) {
                System.out.println(st);
            }  
            System.out.println("\nCOMPARATOR SORTING\n");

            Collections.shuffle(studentList);
            studentList.sort(comparator);
            for (AbstractStudent st : studentList) {
                System.out.println(st);
            }            
        } catch (ParseException e) {
            System.err.println("HATA");
        }
    }
}
