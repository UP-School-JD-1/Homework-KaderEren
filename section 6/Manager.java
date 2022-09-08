public class Manager extends Employee {

    private Employee[] employees;

    public Manager(Departments department, String name, int no, int year, double hourPrice, Employee[] employees) {
        super(department, name, no, year, hourPrice);
        this.employees = employees;

    }
    public void printEmployees () {
        for (Employee item : employees) {
            System.out.println(item.getName());
            
        }
    }

    @Override
    public int getBaseSalary() {
        System.out.println("managerdan çağrıldı");

        return super.getBaseSalary();

    }

    @Override
    public String toString() {
        try {
            return super.getName() + "isimli manager : " + super.calculateSalary() + "bae sala";
        } catch (SalaryPaidOnBankException e) {
            // TODO Auto-generated catch block
            System.err.println(e.getMessage());
            
        } catch (SalaryNotValid e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.err.println(e.getMessage());

        }
        return "";
     
    }
 

}

enum Departments {
    hr, communication, software, accounting
}
