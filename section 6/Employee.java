public class Employee {
    private Departments department;
    private String name;
    private int no;
    private int year;
    private double hourPrice;

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getHourPrice() {
        return hourPrice;
    }

    public void setHourPrice(double hourPrice) {
        this.hourPrice = hourPrice;
    }

    public Employee(Departments department, String name, int no, int year, double hourPrice) {
        this.department = department;
        this.name = name;
        this.no = no;
        this.year = year;
        this.hourPrice = hourPrice;

    }

    public int getBaseSalary() {
        System.out.println("employeeden çağrıldı");
        return 45;
    }

    public double calculateSalary() throws SalaryPaidOnBankException,SalaryNotValid {
        double salary =160 * hourPrice;
        if (salary>=7000) {
            throw new SalaryPaidOnBankException();
        }else if(salary<=0){
            throw new SalaryNotValid();
        }
        return salary;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub

        return super.equals(obj);
    }

}
