package exercises.exerciseclasses;

public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void deposit(double funds){
        accountBalance += funds;
        System.out.println("Deposit of $" + funds + " made. New balance is $" + accountBalance);
    }

    public void withDrawing(double draw){
        if (accountBalance < draw){
            System.out.println("Insuffcient Funds! You only have $" + accountBalance
            + "in your account");
            System.out.println(getAccountBalance());
        } else {
            //setAccountBalance(getAccountBalance() - draw);
            accountBalance -= draw;
            System.out.println("Withdrawal of $" + draw
                    + " processed, Remaining balance = $" + accountBalance);
        }
    }

}
