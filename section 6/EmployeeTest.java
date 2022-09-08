public class EmployeeTest {
    public static void main(String[] args) throws SalaryPaidOnBankException, SalaryNotValid {
        Employee mehmet = new Employee(Departments.software, "MEHMET", 652346733, 2000, 8);
        Employee kader = new Employee(Departments.hr, "KADER", 467839, 1997, 80);
        Employee ali = new Employee(Departments.hr, "ALİ", 467839, 1997, 250);
        Employee[] employeeList = { kader, mehmet, kader, mehmet, ali };
        Manager irem = new Manager(Departments.communication, "İREM", 454554, 1998, -500, employeeList);
        irem.printEmployees();

        mehmet.getBaseSalary();
        irem.getBaseSalary();
        System.out.println(mehmet.hashCode());
        try {
            double salary = irem.calculateSalary();
            System.out.println("iremin maaşı " + salary);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        double ksalary = kader.calculateSalary();
        System.out.println("Kader'in maaşı " + ksalary);

    }

}
