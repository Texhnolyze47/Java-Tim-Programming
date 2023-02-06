package exercises.inheritance;

public class Main {

    public static void main(String[] args) {
        Employee worker = new Employee("Luis","04/22/2001","01/01/2020");

        System.out.println(worker);
        System.out.println("Age = " + worker.getAge());
        System.out.println("Pay = " + worker.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe","11/11/1990",
                "03/03/2020",35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary","05/02/1970",
                "03/03/2021",15);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
}
