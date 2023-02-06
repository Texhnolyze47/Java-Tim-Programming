package exercises.inheritance;

public class Employee extends Worker {

    private long employedId;
    private String hireDate;

    private static int employeeNo = 1;

    public Employee(String name, String birthDate,String hireDate) {
        super(name, birthDate);
        this.employedId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employedId=" + employedId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
